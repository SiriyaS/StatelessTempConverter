/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybean;

import javax.ejb.Stateless;

/**
 *
 * @author siriya_s
 */
@Stateless
public class StatelessTempConverterBean implements StatelessTempConverterBeanRemote {

    @Override
    public double fToC(double fahrenheit) {
        double celcius = (5.0 / 9.0) * (fahrenheit - 32.0);
        return celcius;
    }
}
