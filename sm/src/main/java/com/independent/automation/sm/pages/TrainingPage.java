package  com.independent.automation.sm.pages;

import com.independent.core.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;

/**
 * Created by ctl-user on 17-04-2017.
 */

public class TrainingPage extends BasePage{

    @FindBy(name="training_id")
    WebElement txtTrainingId;
    @FindBy(name="training_type")
    WebElement txtTrainingType;
    @FindBy(name="training_cost_type")
    WebElement txtTrainingCostType;
    @FindBy(xpath="//input[@value='Search']")
    WebElement btnSearch;

    public TrainingPage(WebDriver driver){
        super(driver);
    }

    public void getTrainingDetails(String trainingId, String trainingType,String trainingCostType){
        setText(txtTrainingId,trainingId);
        setText(txtTrainingId,trainingType);
        setText(txtTrainingId,trainingCostType);
        click(btnSearch);
    }

}