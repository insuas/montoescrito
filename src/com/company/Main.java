package com.company;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

        public class Main {
            //variable de clase tipo lista
            public static List<String>  parseoNumeros = new ArrayList<>();

            public static void main(String[] args) {
                for (int i = 90; i < 199;i++) {

                    System.out.println(String.join("",Main.getMontoEscrito(i))); ;
                }

            }
            //recibe un entero con la variable n y entrega una lista con los nombres del 1 al 999
            static List<String> _1_al_999(int n) {
                // 1 - 999
                String unidades[] = {"", "un", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};

                String decenas[] = {"", "", " veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};

                String decenase[] = {"diez ", "once ", "doce ", "trece ", " catorce ", " quince ", "dieciseis ", "diecisiete ", "dieciocho ", "diecinueve "};

                String centenas[] = {"", "ciento ", "doscientos ", "trescientos ", "cuatrocientos ", "quinientos ", "seiscientos ", "setecientos ", "ochocientos ", "novecientos "};

                List<String>  parseoNumeros = new ArrayList<>();
                // XXX
                if (n >= 100) {

                    if (n == 100) {

                        parseoNumeros.add("cien");

                    } else {

                        parseoNumeros.add(centenas[n / 100]);

                    }

                }

                n %= 100;

                if (n < 10) {

                    if (n > 0) {

                        parseoNumeros.add(unidades[n]);

                    }

                } else if (10 <= n && n <= 19) {

                    parseoNumeros.add(decenase[n - 10]);

                } else if (n >= 21 && n <= 29) {

                    parseoNumeros.add("veinti " + unidades[n % 10]);

                } else {

                    parseoNumeros.add(decenas[n / 10]);

                    if (n % 10 > 0) {

                        parseoNumeros.add(" y " + unidades[n % 10]);

                    }

                }

                return parseoNumeros;

            }

            static List<String> getMontoEscrito(int n) {

                String miles[] = {"", " mil ", "millon"};

                List<String>  parseoNumeros = new ArrayList<>();

                if (n == 0) {

                    parseoNumeros.add("cero ");

                } else {

                    int r = 0;

                    while (n > 0) {

                        if (n % 1000 > 0) {

                            List<String> _num3 = _1_al_999(n % 1000);

                            if (n % 1000 == 1 && r == 1) {

                                _num3 = _1_al_999(0);

                            }

                            if (r > 0) {
                                _num3.add(miles[r]);
                            }
                            if (r > 1 && n % 1000!=1) {

                                _num3.add("es ");

                            }
                            parseoNumeros.addAll(0, _num3);

                        }

                        n /= 1000;

                        r++;

                    }

                }

                return  parseoNumeros ;

            }

        }













