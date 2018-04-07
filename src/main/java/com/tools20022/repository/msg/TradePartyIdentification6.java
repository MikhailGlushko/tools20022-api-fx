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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionAmendmentV04;
import com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04;
import com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionV04;
import com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04;
import com.tools20022.repository.choice.PartyIdentification73Choice;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.TreasuryTradePartyRole;
import com.tools20022.repository.entity.TreasuryTradingParty;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FundIdentification4;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Entity involved in an activity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification6#mmSubmittingParty
 * TradePartyIdentification6.mmSubmittingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification6#mmTradeParty
 * TradePartyIdentification6.mmTradeParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification6#mmFundIdentification
 * TradePartyIdentification6.mmFundIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TreasuryTradePartyRole
 * TreasuryTradePartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionV04#mmTradingSideIdentification
 * ForeignExchangeTradeInstructionV04.mmTradingSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionV04#mmCounterpartySideIdentification
 * ForeignExchangeTradeInstructionV04.mmCounterpartySideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04#mmTradingSideIdentification
 * ForeignExchangeTradeInstructionCancellationV04.mmTradingSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04#mmCounterpartySideIdentification
 * ForeignExchangeTradeInstructionCancellationV04.
 * mmCounterpartySideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionAmendmentV04#mmTradingSideIdentification
 * ForeignExchangeTradeInstructionAmendmentV04.mmTradingSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionAmendmentV04#mmCounterpartySideIdentification
 * ForeignExchangeTradeInstructionAmendmentV04.mmCounterpartySideIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04#mmTradingSideIdentification
 * ForeignExchangeTradeStatusAndDetailsNotificationV04.
 * mmTradingSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04#mmCounterpartySideIdentification
 * ForeignExchangeTradeStatusAndDetailsNotificationV04.
 * mmCounterpartySideIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradePartyIdentification6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Entity involved in an activity."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradePartyIdentification6", propOrder = {"submittingParty", "tradeParty", "fundIdentification"})
public class TradePartyIdentification6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SubmitgPty", required = true)
	protected PartyIdentification73Choice submittingParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification73Choice
	 * PartyIdentification73Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification6
	 * TradePartyIdentification6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubmitgPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmittingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that submits the foreign exchange trade to the matching system or to the settlement system or to the counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradePartyIdentification6, PartyIdentification73Choice> mmSubmittingParty = new MMMessageAssociationEnd<TradePartyIdentification6, PartyIdentification73Choice>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradePartyIdentification6.mmObject();
			isDerived = false;
			xmlTag = "SubmitgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmittingParty";
			definition = "Party that submits the foreign exchange trade to the matching system or to the settlement system or to the counterparty.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification73Choice.mmObject();
		}

		@Override
		public PartyIdentification73Choice getValue(TradePartyIdentification6 obj) {
			return obj.getSubmittingParty();
		}

		@Override
		public void setValue(TradePartyIdentification6 obj, PartyIdentification73Choice value) {
			obj.setSubmittingParty(value);
		}
	};
	@XmlElement(name = "TradPty")
	protected PartyIdentification73Choice tradeParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification73Choice
	 * PartyIdentification73Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification6
	 * TradePartyIdentification6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that originated the foreign exchange trade. This party may be the same as the submitting party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradePartyIdentification6, Optional<PartyIdentification73Choice>> mmTradeParty = new MMMessageAssociationEnd<TradePartyIdentification6, Optional<PartyIdentification73Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradePartyIdentification6.mmObject();
			isDerived = false;
			xmlTag = "TradPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeParty";
			definition = "Party that originated the foreign exchange trade. This party may be the same as the submitting party.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification73Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification73Choice> getValue(TradePartyIdentification6 obj) {
			return obj.getTradeParty();
		}

		@Override
		public void setValue(TradePartyIdentification6 obj, Optional<PartyIdentification73Choice> value) {
			obj.setTradeParty(value.orElse(null));
		}
	};
	@XmlElement(name = "FndId")
	protected List<FundIdentification4> fundIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FundIdentification4
	 * FundIdentification4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradingParty#mmInvestmentFund
	 * TreasuryTradingParty.mmInvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification6
	 * TradePartyIdentification6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FndId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the fund that is one of the parties in the foreign exchange trade.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradePartyIdentification6, List<FundIdentification4>> mmFundIdentification = new MMMessageAssociationEnd<TradePartyIdentification6, List<FundIdentification4>>() {
		{
			businessElementTrace_lazy = () -> TreasuryTradingParty.mmInvestmentFund;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradePartyIdentification6.mmObject();
			isDerived = false;
			xmlTag = "FndId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundIdentification";
			definition = "Identifies the fund that is one of the parties in the foreign exchange trade.\r\n";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FundIdentification4.mmObject();
		}

		@Override
		public List<FundIdentification4> getValue(TradePartyIdentification6 obj) {
			return obj.getFundIdentification();
		}

		@Override
		public void setValue(TradePartyIdentification6 obj, List<FundIdentification4> value) {
			obj.setFundIdentification(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradePartyIdentification6.mmSubmittingParty, com.tools20022.repository.msg.TradePartyIdentification6.mmTradeParty,
						com.tools20022.repository.msg.TradePartyIdentification6.mmFundIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(ForeignExchangeTradeInstructionV04.mmTradingSideIdentification, ForeignExchangeTradeInstructionV04.mmCounterpartySideIdentification,
						ForeignExchangeTradeInstructionCancellationV04.mmTradingSideIdentification, ForeignExchangeTradeInstructionCancellationV04.mmCounterpartySideIdentification,
						ForeignExchangeTradeInstructionAmendmentV04.mmTradingSideIdentification, ForeignExchangeTradeInstructionAmendmentV04.mmCounterpartySideIdentification,
						ForeignExchangeTradeStatusAndDetailsNotificationV04.mmTradingSideIdentification, ForeignExchangeTradeStatusAndDetailsNotificationV04.mmCounterpartySideIdentification);
				trace_lazy = () -> TreasuryTradePartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradePartyIdentification6";
				definition = "Entity involved in an activity.";
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification73Choice getSubmittingParty() {
		return submittingParty;
	}

	public TradePartyIdentification6 setSubmittingParty(PartyIdentification73Choice submittingParty) {
		this.submittingParty = Objects.requireNonNull(submittingParty);
		return this;
	}

	public Optional<PartyIdentification73Choice> getTradeParty() {
		return tradeParty == null ? Optional.empty() : Optional.of(tradeParty);
	}

	public TradePartyIdentification6 setTradeParty(PartyIdentification73Choice tradeParty) {
		this.tradeParty = tradeParty;
		return this;
	}

	public List<FundIdentification4> getFundIdentification() {
		return fundIdentification == null ? fundIdentification = new ArrayList<>() : fundIdentification;
	}

	public TradePartyIdentification6 setFundIdentification(List<FundIdentification4> fundIdentification) {
		this.fundIdentification = Objects.requireNonNull(fundIdentification);
		return this;
	}
}