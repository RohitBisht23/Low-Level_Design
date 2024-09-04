public class CompositeAppListen {
    public static void main(String[] args) {
        Department salesDepartment = new SalesDeparment();
        Department financeDepartment = new FinancialDepartment();

        HeadDepartment headDepartment = new HeadDepartment();

        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financeDepartment);

        headDepartment.printDepartmentName();
    }
}
