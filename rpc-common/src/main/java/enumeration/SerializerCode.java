package enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author 3aum0n
 */
@AllArgsConstructor
@Getter
public enum SerializerCode {
    KRYO(0),
    JSON(1);
    private final int code;
}
