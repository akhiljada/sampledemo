package ViolationDemo;
//single responsibility
public class NewEnroll implements AadhaarCardEnrollment{
    private CheckAuthentication checkAuthentication;
    public NewEnroll(CheckAuthentication checkAuthentication){
        this.checkAuthentication=checkAuthentication;
    }
    @Override
    public void name() {
        System.out.println("filled name");
    }

    @Override
    public void basicDetails() {
        System.out.println("filled basic details");
    }

    @Override
    public void contactDetails() {
        System.out.println("filled contact details");
    }

    @Override
    public void address() {
        System.out.println("filled address");
    }

    @Override
    public void generateId() {
        System.out.println("id will be generated");
    }

    @Override
    public void aadhaarId() {
        //first id should be generated
    }

    @Override
    public void verification() {
        //authentication is needed when we update the details
    }
}
