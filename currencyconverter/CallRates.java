package com.example.currencyconverter;

public class CallRates {
    public double getConversionRate(String from, String to){
         return switch (from) {
            case "USD" -> getUSD(to);
            case "EUR" -> getEUR(to);
            case "GBP" -> getGBP(to);
            case "JPY" -> getJPY(to);
            case "PHP" -> getPHP(to);
            case "CAD" -> getCAD(to);
            case "AUD" -> getAUD(to);
            case "CHF" -> getCHF(to);
            case "CNY" -> getCNY(to);
            case "HKD" -> getHKD(to);
            case "NZD" -> getNZD(to);
            case "SGD" -> getSGD(to);
            case "INR" -> getINR(to);
            default -> throw new IllegalArgumentException("Invalid source currency: " + from);
        };
    }
    private double getUSD(String to){ //good for use
        return switch (to) {
            case "USD" -> 1.0;
            case "EUR" -> 0.94;
            case "GBP" -> 0.80;
            case "JPY" -> 153.88;
            case "PHP" -> 56.82;
            case "CAD" -> 1.37;
            case "AUD" -> 1.54;
            case "CHF" -> 0.91;
            case "CNY" -> 7.23;
            case "HKD" -> 7.83;
            case "NZD" -> 1.68;
            case "SGD" -> 1.36;
            case "INR" -> 83.42;
            default -> -1;
        };
    }
    private double getEUR(String toCurrency){ //update later
        return switch (toCurrency) {
            case "USD" -> 1.06;
            case "EUR" -> 1.00;
            case "GBP" -> 0.85;
            case "JPY" -> 164.04;
            case "PHP" -> 60.55;
            case "CAD" -> 1.46;
            case "AUD" -> 1.64;
            case "CHF" -> 0.97;
            case "CNY" -> 7.71;
            case "HKD" -> 8.34;
            case "NZD" -> 1.79;
            case "SGD" -> 1.44;
            case "INR" -> 88.89;
            default -> -1;
        };
    }
    private double getJPY(String toCurrency){ //update later
        return switch (toCurrency) {
            case "USD" -> 0.006480;
            case "EUR" -> 0.006092;
            case "GBP" -> 0.005202;
            case "JPY" -> 1.00;
            case "PHP" -> 0.368423;
            case "CAD" -> 0.008914;
            case "AUD" -> 0.010019;
            case "CHF" -> 0.005927;
            case "CNY" -> 0.046903;
            case "HKD" -> 0.050725;
            case "NZD" -> 0.010935;
            case "SGD" -> 0.008827;
            case "INR" -> 0.540946;
            default -> -1;
        };
    }
    private double getPHP(String toCurrency){ //update later
        return switch (toCurrency) {
            case "USD" -> 0.017584;
            case "EUR" -> 0.016530;
            case "GBP" -> 0.014113;
            case "JPY" -> 2.713655;
            case "PHP" -> 1.00;
            case "CAD" -> 0.024186;
            case "AUD" -> 0.027174;
            case "CHF" -> 0.016078;
            case "CNY" -> 0.127271;
            case "HKD" -> 0.137662;
            case "NZD" -> 0.029660;
            case "SGD" -> 0.023946;
            case "INR" -> 1.467958;
            default -> -1;
        };
    }
    private double getCAD(String toCurrency){ //update later
        return switch (toCurrency) {
            case "USD" -> 0.727205;
            case "EUR" -> 0.683656;
            case "GBP" -> 0.583647;
            case "JPY" -> 112.223225;
            case "PHP" -> 41.357870;
            case "CAD" -> 1.00;
            case "AUD" -> 1.123844;
            case "CHF" -> 0.664898;
            case "CNY" -> 5.263831;
            case "HKD" -> 5.693050;
            case "NZD" -> 1.226590;
            case "SGD" -> 0.990291;
            case "INR" -> 60.705701;
            default -> -1;
        };
    }
    private double getAUD(String toCurrency){ //update later
        return switch (toCurrency) {
            case "USD" -> 0.647498;
            case "EUR" -> 0.608404;
            case "GBP" -> 0.519272;
            case "JPY" -> 99.885268;
            case "PHP" -> 36.799166;
            case "CAD" -> 0.889961;
            case "AUD" -> 1.00;
            case "CHF" -> 0.591978;
            case "CNY" -> 4.686907;
            case "HKD" -> 5.069391;
            case "NZD" -> 1.091301;
            case "SGD" -> 0.881470;
            case "INR" -> 54.050569;
            default -> -1;
        };
    }
    private double getCHF(String toCurrency){ //update later
        return switch (toCurrency) {
            case "USD" -> 1.093832;
            case "EUR" -> 1.027941;
            case "GBP" -> 0.877258;
            case "JPY" -> 168.752628;
            case "PHP" -> 562.169273;
            case "CAD" -> 1.503548;
            case "AUD" -> 1.688881;
            case "CHF" -> 1.00;
            case "CNY" -> 7.917844;
            case "HKD" -> 8.563651;
            case "NZD" -> 1.843488;
            case "SGD" -> 1.489008;
            case "INR" -> 91.294714;
            default -> -1;
        };
    }
    private double getCNY(String toCurrency){ //update later
        return switch (toCurrency) {
            case "USD" -> 0.138151;
            case "EUR" -> 0.129667;
            case "GBP" -> 0.110632;
            case "JPY" -> 21.295571;
            case "PHP" -> 7.847619;
            case "CAD" -> 0.189689;
            case "AUD" -> 0.213071;
            case "CHF" -> 0.126142;
            case "CNY" -> 1.00;
            case "HKD" -> 1.081571;
            case "NZD" -> 0.232613;
            case "SGD" -> 0.187976;
            case "INR" -> 11.527284;
            default -> -1;
        };
    }
    private double getHKD(String toCurrency){ //update later
        return switch (toCurrency) {
            case "USD" -> 0.127730	;
            case "EUR" -> 0.120235;
            case "GBP" -> 0.102621;
            case "JPY" -> 19.697375;
            case "PHP" -> 7.263967;
            case "CAD" -> 0.175884;
            case "AUD" -> 0.197843;
            case "CHF" -> 0.116741;
            case "CNY" -> 0.924567;
            case "HKD" -> 1.00;
            case "NZD" -> 0.215925;
            case "SGD" -> 0.174105;
            case "INR" -> 10.665852;
            default -> -1;
        };
    }
    private double getNZD(String toCurrency){ //update later
        return switch (toCurrency) {
            case "USD" -> 0.591985;
            case "EUR" -> 0.557112;
            case "GBP" -> 0.475377;
            case "JPY" -> 91.334223;
            case "PHP" -> 33.670814;
            case "CAD" -> 0.814966;
            case "AUD" -> 0.916574;
            case "CHF" -> 0.541134;
            case "CNY" -> 4.285237;
            case "HKD" -> 4.634720;
            case "NZD" -> 1.00;
            case "SGD" -> 0.806836;
            case "INR" -> 49.438604;
            default -> -1;
        };
    }
    private double getSGD(String toCurrency){ //update later
        return switch (toCurrency) {
            case "USD" -> 0.733709;
            case "EUR" -> 0.690520;
            case "GBP" -> 0.589158;
            case "JPY" -> 113.196843;
            case "PHP" -> 41.733216;
            case "CAD" -> 1.010119;
            case "AUD" -> 1.135949;
            case "CHF" -> 0.670573;
            case "CNY" -> 5.311144;
            case "HKD" -> 5.744286;
            case "NZD" -> 1.239364;
            case "SGD" -> 1.00;
            case "INR" -> 61.281761;
            default -> -1;
        };
    }
    private double getINR(String toCurrency){ //update later
        return switch (toCurrency) {
            case "USD" -> 0.011974;
            case "EUR" -> 0.011268;
            case "GBP" -> 0.009616;
            case "JPY" -> 1.848026;
            case "PHP" -> 0.680925;
            case "CAD" -> 0.016486;
            case "AUD" -> 0.018543;
            case "CHF" -> 0.010942	;
            case "CNY" -> 0.086674;
            case "HKD" -> 0.093737;
            case "NZD" -> 0.020234;
            case "SGD" -> 0.016322;
            case "INR" -> 1.00;
            default -> -1;
        };
    }
    private double getGBP(String toCurrency){ //update later
        return switch (toCurrency) {
            case "USD" -> 1.245108;
            case "EUR" -> 1.171672	;
            case "GBP" -> 1.00;
            case "JPY" -> 192.165944;
            case "PHP" -> 70.806103;
            case "CAD" -> 1.714354;
            case "AUD" -> 1.928087;
            case "CHF" -> 1.138086;
            case "CNY" -> 9.012804;
            case "HKD" -> 9.747827;
            case "NZD" -> 2.103861;
            case "SGD" -> 1.697134;
            case "INR" -> 103.995841;
            default -> -1;
        };
    }
}
