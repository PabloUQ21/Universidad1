public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Empresa UQ", "102902");

        Empleado empleado0 = new Empleado("1090284590", "Juan David Gomez", "Conserje", "JuanDav7@gmail.com", "3244562722", "20/08/2020" );
        empresa.aniadirEmpleado(empleado0);

        Empleado empleado1 = new Empleado("1087654321", "Maria Fernanda Lopez", "Recepcionista", "MariaFL@gmail.com", "3156789023", "15/03/2018");
        empresa.aniadirEmpleado(empleado1);

        Empleado empleado2 = new Empleado("1076543210", "Carlos Andres Ruiz", "Cocinero", "CarlosAR@gmail.com", "3102345678", "10/06/2019");
        empresa.aniadirEmpleado(empleado2);

        Empleado empleado3 = new Empleado("1065432109", "Luisa Marcela Torres", "Contadora", "LuisaMT@gmail.com", "3129876543", "05/12/2021");
        empresa.aniadirEmpleado(empleado3);

        empresa.mostrarInformacion();


    }
}
