/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.msg.Trade1;
import com.tools20022.repository.msg.Trade2;

/**
 * If ForeignExchangeTradeProduct is present, then TradingCurrency
 * SettlementCurrency TradingMode and PlaceOfConfirmation must be present.
 */
public class ConstraintForeignExchangeTradeProductRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Trade1 Trade1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeTradeProductRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ForeignExchangeTradeProduct is present, then TradingCurrency SettlementCurrency TradingMode and PlaceOfConfirmation must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Trade1> forTrade1 = new MMConstraint<Trade1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeTradeProductRule";
			definition = "If ForeignExchangeTradeProduct is present, then TradingCurrency SettlementCurrency TradingMode and PlaceOfConfirmation must be present.";
			owner_lazy = () -> Trade1.mmObject();
		}

		@Override
		public void executeValidator(Trade1 obj) throws Exception {
			checkTrade1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Trade2 Trade2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeTradeProductRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Foreign Exchange Trade Product is equal to 'FORW'or'NDFO'or'SPOT', then ForeignExchangeDetails must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Trade2> forTrade2 = new MMConstraint<Trade2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeTradeProductRule";
			definition = "If Foreign Exchange Trade Product is equal to 'FORW'or'NDFO'or'SPOT', then ForeignExchangeDetails must be present.";
			owner_lazy = () -> Trade2.mmObject();
		}

		@Override
		public void executeValidator(Trade2 obj) throws Exception {
			checkTrade2(obj);
		}
	};

	/**
	 * If ForeignExchangeTradeProduct is present, then TradingCurrency
	 * SettlementCurrency TradingMode and PlaceOfConfirmation must be present.
	 */
	public static void checkTrade1(Trade1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Foreign Exchange Trade Product is equal to 'FORW'or'NDFO'or'SPOT',
	 * then ForeignExchangeDetails must be present.
	 */
	public static void checkTrade2(Trade2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}