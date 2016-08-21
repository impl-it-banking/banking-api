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
package it.impl.banking.api.account.transaction;

import it.impl.banking.api.account.Account;
import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.Data;

@Data
public class Transaction {

    private LocalDate bookingDate;

    private LocalDate valutaDate;

    private Account counterparty;

    private String purpose;

    private BigDecimal value;

}