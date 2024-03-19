package org.exemplo.models;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraSteps {

    private double numero1;
    private double numero2;
    private double resultado;
    private final Calculadora calculadoraSobTeste = new Calculadora();

    @Given("que o usuário deseja somar os números {double} e {double} na calculadora")
    public void queOUsuarioDesejaSomarOsNumerosNaCalculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    @When("o usuário somar os números")
    public void oUsuarioSomarOsNumeros() {
        resultado = calculadoraSobTeste.somar(numero1, numero2);
    }
    @Then("o resultado exibido é {double}")
    public void oResultadoExibidoE(double saidaEsperada) {
        assertEquals(resultado, saidaEsperada);
    }

    @Given("que o usuário subtrair {double} e {double}")
    public void queOUsuarioSubtrairE(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    @When("o usuário deseja subtrair os números")
    public void oUsuarioDesejaSubtrairOsNumeros() {
        resultado = calculadoraSobTeste.subtrair(numero1, numero2);
    }
    @Then("o resultado da subtração é {double}")
    public void oResultadoDaSubtracaoE(double saidaEsperada) {
        assertEquals(resultado, saidaEsperada);
    }

    @Given("que o usuário deseja multiplicar os números {int} e {int} na calculadora")
    public void queOUsuarioDesejaMultiplicarOsNumerosNaCalculadora(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    @When("o usuário multiplicar os números")
    public void oUsuarioMultiplicarOsNumeros() {
        resultado = calculadoraSobTeste.multiplicar(numero1, numero2);
    }
    @Then("o resultado da multiplicação é {int}")
    public void oResultadoDaMultiplicacaoE(int saidaEsperada) {
        assertEquals(resultado, saidaEsperada);
    }





















}
