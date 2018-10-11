

package xpr;

public class UnknownVariableException extends XPRException {
    public UnknownVariableException(String variableName) {
        super("Unknown variable: " + variableName);
    }
}
