/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package currencyexchanger;

/**
 *
 * @author chris
 */
public class Currency {
    

        private final String moneda;
        private final double value;


        public Currency(String moneda, double value) {
            this.moneda = moneda;
            this.value = value;

        }


        Currency(Object get) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public String getMoneda() {
            return moneda;
        }

        public double getValue() {
            return value;
        }

}

