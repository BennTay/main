package seedu.souschef.logic;

import javafx.collections.ObservableList;

import seedu.souschef.logic.commands.CommandResult;
import seedu.souschef.logic.commands.exceptions.CommandException;
import seedu.souschef.logic.parser.exceptions.ParseException;
import seedu.souschef.model.healthplan.HealthPlan;
import seedu.souschef.model.ingredient.Ingredient;
import seedu.souschef.model.planner.Day;
import seedu.souschef.model.recipe.Recipe;
import seedu.souschef.ui.Ui;

/**
 * API of the Logic component
 */
public interface Logic {
    /**
     * Executes the command and returns the result.
     * @param commandText The command as entered by the user.
     * @return the result of the command execution.
     * @throws CommandException If an error occurs during command execution.
     * @throws ParseException If an error occurs during parsing.
     */
    CommandResult execute(String commandText) throws CommandException, ParseException;

    /** Returns an unmodifiable view of the filtered list of recipes */
    ObservableList<Recipe> getFilteredRecipeList();

    /** Returns an unmodifiable view of the filtered list of recipes */
    ObservableList<Ingredient> getFilteredIngredientList();

    /**
     * returns unmodifiable view of filtered lists of healthplans
     */
    ObservableList<HealthPlan> getFilteredHealthPlanList();

    /**
     * Returns an unmodifiable view of thelists of mealPlans
     */
    ObservableList<Day> getMealPlanList();

    /** Returns the list of input entered by the user, encapsulated in a {@code ListElementPointer} object */
    ListElementPointer getHistorySnapshot();

    /** Sets the Ui attribute of logic */
    void setUi(Ui ui);
}
