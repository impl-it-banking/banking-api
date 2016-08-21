/*
 * Copyright (C) 2016 Benjamin Asbach (https://www.impl.it)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package it.impl.banking.api.account.balance;

import it.impl.banking.api.BankingApiException;

public class BalanceServiceException extends BankingApiException {

    public BalanceServiceException() {
    }

    public BalanceServiceException(Throwable cause) {
        super(cause);
    }

    public BalanceServiceException(String message) {
        super(message);
    }
}
