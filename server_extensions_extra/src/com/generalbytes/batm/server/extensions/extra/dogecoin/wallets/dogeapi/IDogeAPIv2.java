/*************************************************************************************
 * Copyright (C) 2014 GENERAL BYTES s.r.o. All rights reserved.
 *
 * This software may be distributed and modified under the terms of the GNU
 * General Public License version 2 (GPL2) as published by the Free Software
 * Foundation and appearing in the file GPL2.TXT included in the packaging of
 * this file. Please note that GPL2 Section 2[b] requires that all works based
 * on this software must also be made publicly available under the terms of
 * the GPL2 ("Copyleft").
 *
 * Contact information
 * -------------------
 *
 * GENERAL BYTES s.r.o.
 * Web      :  http://www.generalbytes.com
 *
 ************************************************************************************/
package com.generalbytes.batm.server.extensions.extra.dogecoin.wallets.dogeapi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.math.BigDecimal;

@Path("/wow/v2/")
@Produces(MediaType.APPLICATION_JSON)
public interface IDogeAPIv2 {

    @GET
    @Path("?api_key={apikey}&a=get_my_addresses")
    DogeAPIResponse getAddresses(@PathParam("apikey") String apikey);

    @GET
    @Path("?api_key={apikey}&a=get_balance")
    DogeAPIResponse getBalance(@PathParam("apikey") String apikey);

    @GET
    @Path("?api_key={apikey}&a=withdraw&amount_doge={amount}&pin={pin}&payment_address={address}")
    DogeAPIResponse withdraw(@PathParam("apikey") String apikey, @PathParam("pin") String pin, @PathParam("amount") BigDecimal amount, @PathParam("address") String destinationAddress);

    @GET
    @Path("?a=get_info")
    DogeAPIResponse getInfo();

}
