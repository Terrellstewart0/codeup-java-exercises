public class Testing {


    class Employee {
        // ...
        public String getDepartment() {
            if (this.belongsToADepartment) {
                return this.department;
            } else {
                throw new DepartmentNotFoundException("No department found for " + this.name);
            }
        }
        // ...
    }

 }

