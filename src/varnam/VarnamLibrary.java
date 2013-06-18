package varnam;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.PointerByReference;

public interface VarnamLibrary extends Library {
	VarnamLibrary INSTANCE = (VarnamLibrary) Native.loadLibrary("varnam", VarnamLibrary.class);
	
	int varnam_init(String scheme_file, PointerByReference handle, PointerByReference message);
	String varnam_version();
	String varnam_get_scheme_language_code(Pointer handle);

	String varnam_get_last_error(Pointer handle);
	int varnam_transliterate(Pointer handle, String input, PointerByReference output);
	int varnam_learn(Pointer handle, String word);
	int varnam_config(Pointer handle, int type, Object... args);
	
	// varray related functions
	int varray_length(Pointer array);
	Pointer varray_get(Pointer array, int index);
}
