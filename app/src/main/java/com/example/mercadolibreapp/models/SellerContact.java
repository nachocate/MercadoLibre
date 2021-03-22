package com.example.mercadolibreapp.models;

/**

 * Esta clase se encuentra asociada al modelo presentado por la API correpondiente a MercadoLibre.
 * Dicha, modela la entidad Contacto del vendedor
 *
 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class SellerContact {
    private String contact;
    private String other_info;
    private String area_code;
    private String phone;
    private String area_code2;
    private String phone2;
    private String email;
    private String webpage;

    /**
     * Método que retorna el valor de la variable contact
     * @return Retorna el valor de la variable mencionada
     */
    public String getContact() {
        return contact;
    }

    /**
     * Método que retorna el valor de la variable other_info
     * @return Retorna el valor de la variable mencionada
     */
    public String getOther_info() {
        return other_info;
    }

    /**
     * Método que retorna el valor de la variable area_code
     * @return Retorna el valor de la variable mencionada
     */
    public String getArea_code() {
        return area_code;
    }

    /**
     * Método que retorna el valor de la variable phone
     * @return Retorna el valor de la variable mencionada
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Método que retorna el valor de la variable area_code2
     * @return Retorna el valor de la variable mencionada
     */
    public String getArea_code2() {
        return area_code2;
    }

    /**
     * Método que retorna el valor de la variable phone2
     * @return Retorna el valor de la variable mencionada
     */
    public String getPhone2() {
        return phone2;
    }

    /**
     * Método que retorna el valor de la variable email
     * @return Retorna el valor de la variable mencionada
     */
    public String getEmail() {
        return email;
    }

    /**
     * Método que retorna el valor de la variable webpage
     * @return Retorna el valor de la variable mencionada
     */
    public String getWebpage() {
        return webpage;
    }
}
