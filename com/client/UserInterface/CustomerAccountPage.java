package UserInterface;

public class CustomerAccountPage extends AccountPage {


    public String load() {
        return "/index.html";
    }
    
    public void logOut() {
        //Will kill the current connection using SystemController.die()
    }
    
    public String goToSearch() {
        return "/searchPage.html";
    }
    
    public void scrollTrans() {
        //This will point to the appropriate library for representing a scroll bar.
    }
}
