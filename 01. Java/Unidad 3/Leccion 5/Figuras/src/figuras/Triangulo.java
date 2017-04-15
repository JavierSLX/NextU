/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author JavierSLX
 */
public class Triangulo extends Figura
{
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo()
    {
    }
    
    public Triangulo(double lado1, double lado2, double lado3)
    {
       this.lado1 = lado1;
       this.lado2 = lado2;
       this.lado3 = lado3;
    }

    public double getLado1()
    {
        return lado1;
    }

    public void setLado1(double lado1)
    {
        this.lado1 = lado1;
    }

    public double getLado2()
    {
        return lado2;
    }

    public void setLado2(double lado2)
    {
        this.lado2 = lado2;
    }

    public double getLado3()
    {
        return lado3;
    }

    public void setLado3(double lado3)
    {
        this.lado3 = lado3;
    }

    @Override
    public double area()
    {
        return Math.sqrt(semiperimetro() * (semiperimetro() - getLado1()) * (semiperimetro() - getLado2()) * 
            (semiperimetro() - getLado3()));
    }

    @Override
    public double perimetro()
    {
        return (getLado1() + getLado2() + getLado3());
    }
    
    private double semiperimetro()
    {
        return (getLado1() + getLado2() + getLado3()) / 2;
    }
}
