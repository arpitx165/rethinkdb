// Autogenerated by convert_protofile.py at 2015-04-17.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../templates/Enum.java
public enum DatumType {

    public final int value;

    private DatumType(int value){
        this.value = value;
    }
    R_NULL(1),
    R_BOOL(2),
    R_NUM(3),
    R_STR(4),
    R_ARRAY(5),
    R_OBJECT(6),
    R_JSON(7),
}