/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

import project.Messages;



/**
 *
 * @author loole
 */
public class DoughDoesNotFitWithPan {

    public class AccountNotFoundException extends Exception {

        @Override
        public String getMessage() {
            return Messages.Exceptions.DOUGH_DOESNOT_FITWITH_PAN;
        }
    }
}
