/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dal.DALManager;
import dal.RecordsAdder;
import dal.RecordsMapper;
import model.dto.Response;

/**
 *
 * @author Mukhtiar
 */
public class SMSFactory {

    static DALManager getInstanceOfDALManager() {
        return new DALManager(new RecordsMapper());
    }

    public static SMSController getInstanceOfSMSController() {
        return new SMSController();
    }

    static Response getResponseInstance() {
        return new Response();
    }

    public static RecordsAdder getInstanceOfAdder() {
        return new RecordsAdder();
    }
    
}
