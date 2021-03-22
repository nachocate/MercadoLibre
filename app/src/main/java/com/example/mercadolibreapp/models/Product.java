package com.example.mercadolibreapp.models;

import java.io.Serializable;
import java.util.ArrayList;
/**

 * Esta clase se encuentra asociada al modelo presentado por la API correpondiente a MercadoLibre.
 * Dicha, modela la entidad Producto
 *
 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class Product implements Serializable {
    private String site_id;
    private String title;
    private Seller seller;
    private Float price;
    private Prices prices;
    private Long sale_price;
    private String currency_id;
    private Integer  available_quantity;
    private Integer sold_quantity;
    private String buying_mode;
    private String listing_type_id;
    private String stop_time;
    private String condition;
    private String thumbnail;
    private String thumbnail_id;
    private Boolean accepts_mercadopago;
    private Installment installments;
    private Adress address;
    private Shipping shipping;
    private Seller_address seller_address;
    private ArrayList<Attribute> attributes;
    private DifferentialPricing differential_pricing;
    private Float original_price;
    private String category_id;
    private String official_store_id;
    private String domain_id ;
    private String catalog_product_id;
    private ArrayList<String> tags;
    private Integer order_backend;
    private Boolean use_thumbnail_id;
    private Long seller_id;
    private Float base_price;
    private Long initial_quantity;
    private ArrayList<SaleTerms> sale_terms;
    private String start_time;
    private String permalink;
    private String secure_thumbnail;
    private ArrayList<Picture>pictures;
    private String  video_id;
    private ArrayList<Description>descriptions;
    private ArrayList<PaymentMetod> non_mercado_pago_payment_methods;
    private String international_delivery_mode;
    private SellerContact seller_contact;
    private Location location;
    private ArrayList<String>coverage_areas;
    private ArrayList<String>warnings;
    private String listing_source;
    private ArrayList<Varation> variations;
    private String status;
    private ArrayList<String> sub_status;
    private String warranty;
    private String parent_item_id;
    private ArrayList<String>deal_ids;
    private Boolean automatic_relist;
    private String date_created;
    private String last_updated;
    private Float health;
    private Boolean catalog_listing;
    private String message;
    private String error;
    private ArrayList<String> cause;
    private String id;
    private String subtitle;

    /**
     * Método que retorna el valor de la variable getSite_id
     * @return Retorna el valor de la variable mencionada
     */
    public String getSite_id() {
        return site_id;
    }

    /**
     * Método que retorna el valor de la variable title
     * @return Retorna el valor de la variable mencionada
     */
    public String getTitle() {
        return title;
    }

    /**
     * Método que retorna el valor de la variable seller
     * @return Retorna el valor de la variable mencionada
     */
    public Seller getSeller() {
        return seller;
    }

    /**
     * Método que retorna el valor de la variable price
     * @return Retorna el valor de la variable mencionada
     */
    public Float getPrice() {
        return price;
    }

    /**
     * Método que retorna el valor de la variable prices
     * @return Retorna el valor de la variable mencionada
     */
    public Prices getPrices() {
        return prices;
    }

    /**
     * Método que retorna el valor de la variable sale_price
     * @return Retorna el valor de la variable mencionada
     */
    public Long getSale_price() {
        return sale_price;
    }

    /**
     * Método que retorna el valor de la variable currency_id
     * @return Retorna el valor de la variable mencionada
     */
    public String getCurrency_id() {
        return currency_id;
    }

    /**
     * Método que retorna el valor de la variable available_quantity
     * @return Retorna el valor de la variable mencionada
     */
    public Integer getAvailable_quantity() {
        return available_quantity;
    }

    /**
     * Método que retorna el valor de la variable sold_quantity
     * @return Retorna el valor de la variable mencionada
     */
    public Integer getSold_quantity() {
        return sold_quantity;
    }

    /**
     * Método que retorna el valor de la variable buying_mode
     * @return Retorna el valor de la variable mencionada
     */
    public String getBuying_mode() {
        return buying_mode;
    }

    /**
     * Método que retorna el valor de la variable listing_type_id
     * @return Retorna el valor de la variable mencionada
     */
    public String getListing_type_id() {
        return listing_type_id;
    }

    /**
     * Método que retorna el valor de la variable stop_time
     * @return Retorna el valor de la variable mencionada
     */
    public String getStop_time() {
        return stop_time;
    }

    /**
     * Método que retorna el valor de la variable condition
     * @return Retorna el valor de la variable mencionada
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Método que retorna el valor de la variable thumbnail
     * @return Retorna el valor de la variable mencionada
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * Método que retorna el valor de la variable thumbnail_id
     * @return Retorna el valor de la variable mencionada
     */
    public String getThumbnail_id() {
        return thumbnail_id;
    }

    /**
     * Método que retorna el valor de la variable accepts_mercadopago
     * @return Retorna el valor de la variable mencionada
     */
    public Boolean getAccepts_mercadopago() {
        return accepts_mercadopago;
    }

    /**
     * Método que retorna el valor de la variable installments
     * @return Retorna el valor de la variable mencionada
     */
    public Installment getInstallments() {
        return installments;
    }

    /**
     * Método que retorna el valor de la variable address
     * @return Retorna el valor de la variable mencionada
     */
    public Adress getAddress() {
        return address;
    }

    /**
     * Método que retorna el valor de la variable shipping
     * @return Retorna el valor de la variable mencionada
     */
    public Shipping getShipping() {
        return shipping;
    }

    /**
     * Método que retorna el valor de la variable seller_address
     * @return Retorna el valor de la variable mencionada
     */
    public Seller_address getSeller_address() {
        return seller_address;
    }

    /**
     * Método que retorna el valor de la variable attributes
     * @return Retorna el valor de la variable mencionada
     */
    public ArrayList<Attribute> getAttributes() {
        return attributes;
    }

    /**
     * Método que retorna el valor de la variable differential_pricing
     * @return Retorna el valor de la variable mencionada
     */
    public DifferentialPricing getDifferential_pricing() {
        return differential_pricing;
    }

    /**
     * Método que retorna el valor de la variable original_price
     * @return Retorna el valor de la variable mencionada
     */
    public Float getOriginal_price() {
        return original_price;
    }

    /**
     * Método que retorna el valor de la variable category_id
     * @return Retorna el valor de la variable mencionada
     */
    public String getCategory_id() {
        return category_id;
    }

    /**
     * Método que retorna el valor de la variable official_store_id
     * @return Retorna el valor de la variable mencionada
     */
    public String getOfficial_store_id() {
        return official_store_id;
    }

    /**
     * Método que retorna el valor de la variable domain_id
     * @return Retorna el valor de la variable mencionada
     */
    public String getDomain_id() {
        return domain_id;
    }

    /**
     * Método que retorna el valor de la variable catalog_product_id
     * @return Retorna el valor de la variable mencionada
     */
    public String getCatalog_product_id() {
        return catalog_product_id;
    }

    /**
     * Método que retorna el valor de la variable tags
     * @return Retorna el valor de la variable mencionada
     */
    public ArrayList<String> getTags() {
        return tags;
    }

    /**
     * Método que retorna el valor de la variable order_backend
     * @return Retorna el valor de la variable mencionada
     */
    public Integer getOrder_backend() {
        return order_backend;
    }

    /**
     * Método que retorna el valor de la variable use_thumbnail_id
     * @return Retorna el valor de la variable mencionada
     */
    public Boolean getUse_thumbnail_id() {
        return use_thumbnail_id;
    }

    /**
     * Método que retorna el valor de la variable seller_id
     * @return Retorna el valor de la variable mencionada
     */
    public Long getSeller_id() {
        return seller_id;
    }

    /**
     * Método que retorna el valor de la variable base_price
     * @return Retorna el valor de la variable mencionada
     */
    public Float getBase_price() {
        return base_price;
    }


    /**
     * Método que retorna el valor de la variable initial_quantity
     * @return Retorna el valor de la variable mencionada
     */
    public Long getInitial_quantity() {
        return initial_quantity;
    }

    /**
     * Método que retorna el valor de la variable sale_terms
     * @return Retorna el valor de la variable mencionada
     */
    public ArrayList<SaleTerms> getSale_terms() {
        return sale_terms;
    }

    /**
     * Método que retorna el valor de la variable start_time
     * @return Retorna el valor de la variable mencionada
     */
    public String getStart_time() {
        return start_time;
    }

    /**
     * Método que retorna el valor de la variable permalink
     * @return Retorna el valor de la variable mencionada
     */
    public String getPermalink() {
        return permalink;
    }

    /**
     * Método que retorna el valor de la variable secure_thumbnail
     * @return Retorna el valor de la variable mencionada
     */
    public String getSecure_thumbnail() {
        return secure_thumbnail;
    }

    /**
     * Método que retorna el valor de la variable pictures
     * @return Retorna el valor de la variable mencionada
     */
    public ArrayList<Picture> getPictures() {
        return pictures;
    }

    /**
     * Método que retorna el valor de la variable video_id
     * @return Retorna el valor de la variable mencionada
     */
    public String getVideo_id() {
        return video_id;
    }

    /**
     * Método que retorna el valor de la variable descriptions
     * @return Retorna el valor de la variable mencionada
     */
    public ArrayList<Description> getDescriptions() {
        return descriptions;
    }

    /**
     * Método que retorna el valor de la variable non_mercado_pago_payment_methods
     * @return Retorna el valor de la variable mencionada
     */
    public ArrayList<PaymentMetod> getNon_mercado_pago_payment_methods() {
        return non_mercado_pago_payment_methods;
    }

    /**
     * Método que retorna el valor de la variable international_delivery_mode
     * @return Retorna el valor de la variable mencionada
     */
    public String getInternational_delivery_mode() {
        return international_delivery_mode;
    }

    /**
     * Método que retorna el valor de la variable seller_contact
     * @return Retorna el valor de la variable mencionada
     */
    public SellerContact getSeller_contact() {
        return seller_contact;
    }

    /**
     * Método que retorna el valor de la variable location
     * @return Retorna el valor de la variable mencionada
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Método que retorna el valor de la variable coverage_areas
     * @return Retorna el valor de la variable mencionada
     */
    public ArrayList<String> getCoverage_areas() {
        return coverage_areas;
    }

    /**
     * Método que retorna el valor de la variable warnings
     * @return Retorna el valor de la variable mencionada
     */
    public ArrayList<String> getWarnings() {
        return warnings;
    }

    /**
     * Método que retorna el valor de la variable listing_source
     * @return Retorna el valor de la variable mencionada
     */
    public String getListing_source() {
        return listing_source;
    }

    /**
     * Método que retorna el valor de la variable variations
     * @return Retorna el valor de la variable mencionada
     */
    public ArrayList<Varation> getVariations() {
        return variations;
    }

    /**
     * Método que retorna el valor de la variable status
     * @return Retorna el valor de la variable mencionada
     */
    public String getStatus() {
        return status;
    }

    /**
     * Método que retorna el valor de la variable sub_status
     * @return Retorna el valor de la variable mencionada
     */
    public ArrayList<String> getSub_status() {
        return sub_status;
    }

    /**
     * Método que retorna el valor de la variable warranty
     * @return Retorna el valor de la variable mencionada
     */
    public String getWarranty() {
        return warranty;
    }

    /**
     * Método que retorna el valor de la variable parent_item_id
     * @return Retorna el valor de la variable mencionada
     */
    public String getParent_item_id() {
        return parent_item_id;
    }

    /**
     * Método que retorna el valor de la variable deal_ids
     * @return Retorna el valor de la variable mencionada
     */
    public ArrayList<String> getDeal_ids() {
        return deal_ids;
    }

    /**
     * Método que retorna el valor de la variable automatic_relist
     * @return Retorna el valor de la variable mencionada
     */
    public Boolean getAutomatic_relist() {
        return automatic_relist;
    }

    /**
     * Método que retorna el valor de la variable date_created
     * @return Retorna el valor de la variable mencionada
     */
    public String getDate_created() {
        return date_created;
    }

    /**
     * Método que retorna el valor de la variable last_updated
     * @return Retorna el valor de la variable mencionada
     */
    public String getLast_updated() {
        return last_updated;
    }

    /**
     * Método que retorna el valor de la variable health
     * @return Retorna el valor de la variable mencionada
     */
    public Float getHealth() {
        return health;
    }

    /**
     * Método que retorna el valor de la variable catalog_listing
     * @return Retorna el valor de la variable mencionada
     */
    public Boolean getCatalog_listing() {
        return catalog_listing;
    }

    /**
     * Método que retorna el valor de la variable message
     * @return Retorna el valor de la variable mencionada
     */
    public String getMessage() {
        return message;
    }

    /**
     * Método que retorna el valor de la variable error
     * @return Retorna el valor de la variable mencionada
     */
    public String getError() {
        return error;
    }

    /**
     * Método que retorna el valor de la variable cause
     * @return Retorna el valor de la variable mencionada
     */
    public ArrayList<String> getCause() {
        return cause;
    }

    /**
     * Método que retorna el valor de la variable id
     * @return Retorna el valor de la variable mencionada
     */
    public String getId() {
        return id;
    }

    /**
     * Método que retorna el valor de la variable subtitle
     * @return Retorna el valor de la variable mencionada
     */
    public String getSubtitle() {
        return subtitle;
    }
}
