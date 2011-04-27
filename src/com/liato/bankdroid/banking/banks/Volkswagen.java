/*
 * Copyright (C) 2010 Nullbyte <http://nullbyte.eu>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.liato.bankdroid.banking.banks;

import android.content.Context;

import com.liato.bankdroid.banking.Bank;
import com.liato.bankdroid.banking.exceptions.BankChoiceException;
import com.liato.bankdroid.banking.exceptions.BankException;
import com.liato.bankdroid.banking.exceptions.LoginException;


public class Volkswagen extends IkanoPartnerBase {
	private static final String TAG = "Volkswagen";
	private static final String NAME = "Volkswagenkortet";
	private static final String NAME_SHORT = "volkswagen";
	private static final String URL = "https://partner.ikanobank.se/web/engines/page.aspx?structid=1319";
	private static final int BANKTYPE_ID = Bank.VOLKSWAGEN;

    public Volkswagen(Context context) {
        super(context);
        super.TAG = TAG;
        super.NAME = NAME;
        super.NAME_SHORT = NAME_SHORT;
        super.BANKTYPE_ID = BANKTYPE_ID;
        super.URL = URL;
        this.structId = "1319";
    }

    public Volkswagen(String username, String password, Context context) throws BankException, LoginException, BankChoiceException {
        this(context);
        this.update(username, password);
    }


}
