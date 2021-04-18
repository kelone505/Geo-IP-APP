package com.kelone505.ipappretrofit

class Ip {
    private var ip:String=""
    private var country_code:String=""
    private var country_name:String=""
    private var region_code:String=""
    private var region_name:String=""
    private var city:String=""
    private var zip_code:String=""
    private var time_zone:String=""
    private var latitude:Double=0.0
    private var longitude:Double=0.0
    private var metro_code:Int=0
    constructor(){}

    override fun toString(): String {
        return "ip='$ip', \ncountry_code='$country_code'," +
                " \ncountry_name='$country_name', \nregion_code='$region_code'," +
                " \nregion_name='$region_name', \ncity='$city', \nzip_code='$zip_code'," +
                " \ntime_zone='$time_zone', \nlatitude=$latitude, \nlongitude=$longitude," +
                " \nmetro_code=$metro_code"
    }
}