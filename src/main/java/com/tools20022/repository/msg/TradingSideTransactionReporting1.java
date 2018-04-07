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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.PartyIdentification73Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.ReportingPartyRole;
import com.tools20022.repository.entity.Trade;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.UniqueTransactionIdentifier2;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This is regulatory transaction reporting information from the Trading Side
 * party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradingSideTransactionReporting1#mmReportingJurisdiction
 * TradingSideTransactionReporting1.mmReportingJurisdiction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradingSideTransactionReporting1#mmReportingParty
 * TradingSideTransactionReporting1.mmReportingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradingSideTransactionReporting1#mmTradingSideUniqueTransactionIdentifier
 * TradingSideTransactionReporting1.mmTradingSideUniqueTransactionIdentifier}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ReportingPartyRole
 * ReportingPartyRole}</li>
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
 * "TradingSideTransactionReporting1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "This is regulatory transaction reporting information from the Trading Side party."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradingSideTransactionReporting1", propOrder = {"reportingJurisdiction", "reportingParty", "tradingSideUniqueTransactionIdentifier"})
public class TradingSideTransactionReporting1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RptgJursdctn")
	protected Max35Text reportingJurisdiction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradingSideTransactionReporting1
	 * TradingSideTransactionReporting1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgJursdctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingJurisdiction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the supervisory party to which the trade needs to be reported."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradingSideTransactionReporting1, Optional<Max35Text>> mmReportingJurisdiction = new MMMessageAttribute<TradingSideTransactionReporting1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradingSideTransactionReporting1.mmObject();
			isDerived = false;
			xmlTag = "RptgJursdctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingJurisdiction";
			definition = "Specifies the supervisory party to which the trade needs to be reported.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TradingSideTransactionReporting1 obj) {
			return obj.getReportingJurisdiction();
		}

		@Override
		public void setValue(TradingSideTransactionReporting1 obj, Optional<Max35Text> value) {
			obj.setReportingJurisdiction(value.orElse(null));
		}
	};
	@XmlElement(name = "RptgPty")
	protected PartyIdentification73Choice reportingParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
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
	 * {@linkplain com.tools20022.repository.msg.TradingSideTransactionReporting1
	 * TradingSideTransactionReporting1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the party that is responsible for reporting the trade to the trade repository."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradingSideTransactionReporting1, Optional<PartyIdentification73Choice>> mmReportingParty = new MMMessageAttribute<TradingSideTransactionReporting1, Optional<PartyIdentification73Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradingSideTransactionReporting1.mmObject();
			isDerived = false;
			xmlTag = "RptgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingParty";
			definition = "Identifies the party that is responsible for reporting the trade to the trade repository.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification73Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification73Choice> getValue(TradingSideTransactionReporting1 obj) {
			return obj.getReportingParty();
		}

		@Override
		public void setValue(TradingSideTransactionReporting1 obj, Optional<PartyIdentification73Choice> value) {
			obj.setReportingParty(value.orElse(null));
		}
	};
	@XmlElement(name = "TradgSdUnqTxIdr")
	protected List<UniqueTransactionIdentifier2> tradingSideUniqueTransactionIdentifier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.UniqueTransactionIdentifier2
	 * UniqueTransactionIdentifier2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeRelatedIdentifications
	 * Trade.mmTradeRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradingSideTransactionReporting1
	 * TradingSideTransactionReporting1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgSdUnqTxIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSideUniqueTransactionIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the unique transaction identifier (UTI) to be created at the time a transaction is first executed, shared with all registered entities and counterparties involved in the transaction, and used to track that particular transaction over its life. This identifier can also be known as the Unique Swap Identifier (USI). This is the UTI from the Trading Side party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradingSideTransactionReporting1, List<UniqueTransactionIdentifier2>> mmTradingSideUniqueTransactionIdentifier = new MMMessageAttribute<TradingSideTransactionReporting1, List<UniqueTransactionIdentifier2>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeRelatedIdentifications;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradingSideTransactionReporting1.mmObject();
			isDerived = false;
			xmlTag = "TradgSdUnqTxIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSideUniqueTransactionIdentifier";
			definition = "Specifies the unique transaction identifier (UTI) to be created at the time a transaction is first executed, shared with all registered entities and counterparties involved in the transaction, and used to track that particular transaction over its life. This identifier can also be known as the Unique Swap Identifier (USI). This is the UTI from the Trading Side party.";
			minOccurs = 0;
			complexType_lazy = () -> UniqueTransactionIdentifier2.mmObject();
		}

		@Override
		public List<UniqueTransactionIdentifier2> getValue(TradingSideTransactionReporting1 obj) {
			return obj.getTradingSideUniqueTransactionIdentifier();
		}

		@Override
		public void setValue(TradingSideTransactionReporting1 obj, List<UniqueTransactionIdentifier2> value) {
			obj.setTradingSideUniqueTransactionIdentifier(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradingSideTransactionReporting1.mmReportingJurisdiction, com.tools20022.repository.msg.TradingSideTransactionReporting1.mmReportingParty,
						com.tools20022.repository.msg.TradingSideTransactionReporting1.mmTradingSideUniqueTransactionIdentifier);
				trace_lazy = () -> ReportingPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradingSideTransactionReporting1";
				definition = "This is regulatory transaction reporting information from the Trading Side party.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getReportingJurisdiction() {
		return reportingJurisdiction == null ? Optional.empty() : Optional.of(reportingJurisdiction);
	}

	public TradingSideTransactionReporting1 setReportingJurisdiction(Max35Text reportingJurisdiction) {
		this.reportingJurisdiction = reportingJurisdiction;
		return this;
	}

	public Optional<PartyIdentification73Choice> getReportingParty() {
		return reportingParty == null ? Optional.empty() : Optional.of(reportingParty);
	}

	public TradingSideTransactionReporting1 setReportingParty(PartyIdentification73Choice reportingParty) {
		this.reportingParty = reportingParty;
		return this;
	}

	public List<UniqueTransactionIdentifier2> getTradingSideUniqueTransactionIdentifier() {
		return tradingSideUniqueTransactionIdentifier == null ? tradingSideUniqueTransactionIdentifier = new ArrayList<>() : tradingSideUniqueTransactionIdentifier;
	}

	public TradingSideTransactionReporting1 setTradingSideUniqueTransactionIdentifier(List<UniqueTransactionIdentifier2> tradingSideUniqueTransactionIdentifier) {
		this.tradingSideUniqueTransactionIdentifier = Objects.requireNonNull(tradingSideUniqueTransactionIdentifier);
		return this;
	}
}