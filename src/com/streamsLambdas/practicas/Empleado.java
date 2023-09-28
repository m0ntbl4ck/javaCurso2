
package com.streamsLambdas.practicas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mont_
 */
public class Empleado {
    private String primerNombre;
    private String segundoNombre;
    private int edad;
    private Genero genero;
    private Rol rol;
    private double salario;
    private String dept;
    private String email;
    private String telefono;
    private String direccion;
    private String departamento;
    private String ciudad;
    private String codigo;
    private Cargo cargo;
    
    public static class Builder{
        private String primerNombre;
    private String segundoNombre;
    private int edad;
    private Genero genero;
    private Rol rol;
    private Cargo cargo;
    private String dept;
    private String email;
    private String telefono;
    private String direccion;
    private String departamento;
    private String ciudad;
    private String codigo;
    private double salario;

        public Empleado.Builder  salario(double salario) {
            this.salario = salario;
            return this;
        }

    
        public Empleado.Builder primerNombre(String primerNombre) {
            this.primerNombre = primerNombre;
            return this;
        }

        public Empleado.Builder segundoNombre(String segundoNombre) {
            this.segundoNombre = segundoNombre;
            return this;
        }

        public Empleado.Builder edad(int edad) {
            this.edad = edad;
            return this;
        }

        public Empleado.Builder genero(Genero genero) {
            this.genero = genero;
            return this;
        }

        public Empleado.Builder rol(Rol rol) {
            this.rol = rol;
            return this;
        }
public Empleado.Builder cargo(Cargo argo) {
            this.cargo = cargo;
            return this;
        }
        public Empleado.Builder dept(String dept) {
            this.dept = dept;
            return this;
        }

        public Empleado.Builder email(String email) {
            this.email = email;
            return this;
        }

        public Empleado.Builder telefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public Empleado.Builder direccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public Empleado.Builder departamento(String departamento) {
            this.departamento = departamento;
            return this;
        }

        public Empleado.Builder ciudad(String ciudad) {
            this.ciudad = ciudad;
            return this;
        }

        public Empleado.Builder codigo(String codigo) {
            this.codigo = codigo;
            return this;
        }
    
    public Empleado build(){
        return new Empleado(this);
    }  
    
    }

    
    
    private Empleado(Empleado.Builder builder){
       this.primerNombre = builder.primerNombre;
        this.segundoNombre = builder.segundoNombre;
        this.edad = builder.edad;
        this.genero = builder.genero;
        this.rol = builder.rol;
        this.dept = builder.dept;
        this.email = builder.email;
        this.cargo = builder.cargo;
        this.telefono = builder.telefono;
        this.direccion = builder.direccion;
        this.departamento = builder.departamento;
        this.ciudad = builder.ciudad;
        this.codigo = builder.codigo; 
        this.salario = builder.salario;
    }

    public double getSalario() {
        return salario;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public int getEdad() {
        return edad;
    }

    public Genero getGenero() {
        return genero;
    }

    public Rol getRol() {
        return rol;
    }

    public String getDept() {
        return dept;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getCodigo() {
        return codigo;
    }
    
    public void print(){
        System.out.println(
        "\nPrimer Nombre: "+ this.primerNombre +" "+ this.segundoNombre+ "\n"+ 
        "Edad: " + this.edad+ "\n"+
         "Genero: " + this.genero+ "\n"+
            "Cargo: " + this.cargo+ "\n"+      
         "Rol: "+ this.rol+ "\n"+
                  "Salario: "+ this.salario+ "\n"+
         "Departamento: "+this.dept+ "\n"+ 
         "Emal: "+this.email+ "\n"+
         "Telefono: "+this.telefono+ "\n"+
          "Direccion: "+this.direccion+ "\n"+
          "Departamento: "+this.departamento + "\n"+
           "Ciudad: " + this.ciudad + "\n"+
           "Codigo: "+this.codigo + "\n");
    }

    @Override
    public String toString() {
        return "Nombre: " + "primerNombre: " + primerNombre + " " + segundoNombre + ", edad: " + edad + ", genero: " + genero + ", cargo: " + cargo +", rol: " + rol + ", salario: " + salario + ", dept: " + dept + ", email: " + email + ", telefono: " + telefono + ", direccion: " + direccion + ", departamento: " + departamento + ", ciudad: " + ciudad + ", codigo: " + codigo;
    }
    
    public  String getResumen()
            {
                return 
                   "Nombre: "+ primerNombre + " " + segundoNombre+
                   " rol: " + rol +
                   " dept: " + dept +
                   " email: " + email +
                        " salario: " + salario;
           
            }  
    
     public  void imprimirResumen()
            {
                System.out.println(
                   "Nombre: "+ primerNombre + " " + segundoNombre+
                   " rol: " + rol +
                   " dept: " + dept +
                   " email: " + email +
                        " salario: " + salario);
            }
    
    public static List<Empleado> crearLista(){
        List<Empleado> gente = new ArrayList<>();
        
       
        gente.add(new Empleado.Builder()
        .primerNombre("Alejandro")
        .segundoNombre("Ortiz")
                .edad(23)
                .genero(Genero.MASCULINO)
                .rol(Rol.STAFF)
                .salario(40000)
                .cargo(Cargo.INGENIERIO)
                .dept("Ventas")
                .email("alejandro@email.com")
                .telefono("3118283382")
                .direccion("calle 26 # 45-29 sur")
                .departamento("Bogota DC")
                .ciudad("Bogota")
                .codigo("112921")
                .build());
        
        gente.add(new Empleado.Builder()
        .primerNombre("Andrea")
        .segundoNombre("Gonzalez")
                .edad(34)
                .genero(Genero.FEMENINO)
                .cargo(Cargo.INGENIERIO)
                .rol(Rol.STAFF)
                .salario(45000)
                .dept("Ventas")
                .email("andrea@email.com")
                .telefono("3134253348")
                .direccion("calle 46 # 49-12")
                .departamento("Bogota DC")
                .ciudad("Bogota")
                .codigo("123123")
                .build());
        
        
        gente.add(new Empleado.Builder()
        .primerNombre("Jose")
        .segundoNombre("Gutierrez")
                .edad(40)
                .genero(Genero.MASCULINO)
                .rol(Rol.MANAGER)
                .dept("Ventas")
                .salario(65000)
                .email("jose@email.com")
                .telefono("3204122231")
                .direccion("calle 102 # 23-10")
                .departamento("Antioquia")
                .ciudad("Medellin")
                .codigo("123123")
                .build());
        
        
         gente.add(new Empleado.Builder()
        .primerNombre("Alberto")
        .segundoNombre("Mendez")
                .edad(45)
                .genero(Genero.MASCULINO)
                .rol(Rol.EJECUTIVO)
                .dept("Ventas")
                 .salario(100000)
                .email("alberto@email.com")
                .telefono("3213224531")
                .direccion("calle 145 # 10-12")
                .departamento("Bogota DC")
                .ciudad("Bogota")
                .codigo("133413")
                .build());
         
         
         gente.add(new Empleado.Builder()
        .primerNombre("Luisa")
        .segundoNombre("Garzon")
                .edad(25)
                .genero(Genero.FEMENINO)
                .rol(Rol.STAFF)
                 .salario(50000)
                .dept("Turismo")
                .email("luisa@email.com")
                .telefono("3183228790")
                .direccion("calle 1 # 23-55")
                .departamento("Valle")
                .ciudad("Cali")
                .codigo("123241")
                .build());
         
         
         
         gente.add(new Empleado.Builder()
        .primerNombre("Carmen")
        .segundoNombre("Rocio")
                .edad(38)
                .genero(Genero.FEMENINO)
                .rol(Rol.EJECUTIVO)
                 .salario(90000)
                .dept("Turismo")
                .email("carmen@email.com")
                .telefono("3123345533")
                .direccion("carrera 12A # 22-22")
                .departamento("Bogota DC")
                .ciudad("Bogota")
                .codigo("123422")
                .build());
         
         
         
         gente.add(new Empleado.Builder()
        .primerNombre("German")
        .segundoNombre("Velasquez")
                .edad(31)
                .genero(Genero.MASCULINO)
                .rol(Rol.STAFF)
                 .salario(60000)
                .dept("Turismo")
                .email("german@email.com")
                .telefono("3012039483")
                .direccion("calle 22 # 231-33")
                .departamento("Bogota DC")
                .ciudad("Bogota")
                .codigo("123421")
                .build());
         
         
         
         gente.add(new Empleado.Builder()
        .primerNombre("Juan")
        .segundoNombre("Fernandez")
                .edad(65)
                .genero(Genero.MASCULINO)
                .rol(Rol.EJECUTIVO)
                 .salario(120000)
                .dept("Ventas")
                .email("juan@email.com")
                .telefono("3233257785")
                .direccion("calle 149 # 7-22")
                .departamento("Bogota DC")
                .ciudad("Bogota")
                .codigo("312314")
                .build());
         
         return gente;
    }
    
    }
    

