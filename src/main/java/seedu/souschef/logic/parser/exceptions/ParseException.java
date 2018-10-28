package seedu.souschef.logic.parser.exceptions;

import seedu.souschef.commons.exceptions.IllegalValueException;

/**
 * Represents a parseIndex error encountered by a parser.
 */
public class ParseException extends IllegalValueException {

    public ParseException(String message) {
        super(message);
    }

    public ParseException(String message, Throwable cause) {
        super(message, cause);
    }
}
