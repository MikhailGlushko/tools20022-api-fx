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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.PartyIdentification73Choice;
import com.tools20022.repository.codeset.AllocationIndicator1Code;
import com.tools20022.repository.codeset.CollateralisationIndicator1Code;
import com.tools20022.repository.codeset.CorporateSectorIdentifier1Code;
import com.tools20022.repository.codeset.UnderlyingProductIdentifier1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ClearingBrokerIdentification1;
import com.tools20022.repository.msg.CounterpartySideTransactionReporting1;
import com.tools20022.repository.msg.TradingSideTransactionReporting1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Includes data elements that can be used for reporting to trade repositories,
 * it is not to be used on regular trade confirmations. Although some fields,
 * for example, unique transaction identifier and prior unique transaction
 * identifier, might be used on regular trade confirmations.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmTradingSideTransactionReporting
 * RegulatoryReporting4.mmTradingSideTransactionReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmCounterpartySideTransactionReporting
 * RegulatoryReporting4.mmCounterpartySideTransactionReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmCentralCounterpartyClearingHouse
 * RegulatoryReporting4.mmCentralCounterpartyClearingHouse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmClearingBroker
 * RegulatoryReporting4.mmClearingBroker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmClearingExceptionParty
 * RegulatoryReporting4.mmClearingExceptionParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmClearingBrokerIdentification
 * RegulatoryReporting4.mmClearingBrokerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmClearingThresholdIndicator
 * RegulatoryReporting4.mmClearingThresholdIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmClearedProductIdentification
 * RegulatoryReporting4.mmClearedProductIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmUnderlyingProductIdentifier
 * RegulatoryReporting4.mmUnderlyingProductIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmAllocationIndicator
 * RegulatoryReporting4.mmAllocationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmCollateralisationIndicator
 * RegulatoryReporting4.mmCollateralisationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmExecutionVenue
 * RegulatoryReporting4.mmExecutionVenue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmExecutionTimestamp
 * RegulatoryReporting4.mmExecutionTimestamp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmNonStandardFlag
 * RegulatoryReporting4.mmNonStandardFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmLinkSwapIdentification
 * RegulatoryReporting4.mmLinkSwapIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmFinancialNatureOfTheCounterpartyIndicator
 * RegulatoryReporting4.mmFinancialNatureOfTheCounterpartyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmCollateralPortfolioIndicator
 * RegulatoryReporting4.mmCollateralPortfolioIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmCollateralPortfolioCode
 * RegulatoryReporting4.mmCollateralPortfolioCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmPortfolioCompressionIndicator
 * RegulatoryReporting4.mmPortfolioCompressionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmCorporateSectorIndicator
 * RegulatoryReporting4.mmCorporateSectorIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmTradeWithNonEEACounterpartyIndicator
 * RegulatoryReporting4.mmTradeWithNonEEACounterpartyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmIntragroupTradeIndicator
 * RegulatoryReporting4.mmIntragroupTradeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmCommercialOrTreasuryFinancingIndicator
 * RegulatoryReporting4.mmCommercialOrTreasuryFinancingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmAdditionalReportingInformation
 * RegulatoryReporting4.mmAdditionalReportingInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.RegulatoryReport
 * RegulatoryReport}</li>
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
 * "RegulatoryReporting4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Includes data elements that can be used for reporting to trade repositories, it is not to be used on regular trade confirmations. Although some fields, for example, unique transaction identifier and prior unique transaction identifier, might be used on regular trade confirmations."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RegulatoryReporting6
 * RegulatoryReporting6}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RegulatoryReporting4", propOrder = {"tradingSideTransactionReporting", "counterpartySideTransactionReporting", "centralCounterpartyClearingHouse", "clearingBroker", "clearingExceptionParty", "clearingBrokerIdentification",
		"clearingThresholdIndicator", "clearedProductIdentification", "underlyingProductIdentifier", "allocationIndicator", "collateralisationIndicator", "executionVenue", "executionTimestamp", "nonStandardFlag", "linkSwapIdentification",
		"financialNatureOfTheCounterpartyIndicator", "collateralPortfolioIndicator", "collateralPortfolioCode", "portfolioCompressionIndicator", "corporateSectorIndicator", "tradeWithNonEEACounterpartyIndicator",
		"intragroupTradeIndicator", "commercialOrTreasuryFinancingIndicator", "additionalReportingInformation"})
public class RegulatoryReporting4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TradgSdTxRptg")
	protected List<TradingSideTransactionReporting1> tradingSideTransactionReporting;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TradingSideTransactionReporting1
	 * TradingSideTransactionReporting1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReport
	 * RegulatoryReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgSdTxRptg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSideTransactionReporting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Regulatory transaction reporting information from the Trading Side party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmTradingSideTransactionReporting
	 * RegulatoryReporting6.mmTradingSideTransactionReporting}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RegulatoryReporting4, List<TradingSideTransactionReporting1>> mmTradingSideTransactionReporting = new MMMessageAssociationEnd<RegulatoryReporting4, List<TradingSideTransactionReporting1>>() {
		{
			businessComponentTrace_lazy = () -> RegulatoryReport.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "TradgSdTxRptg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSideTransactionReporting";
			definition = "Regulatory transaction reporting information from the Trading Side party.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmTradingSideTransactionReporting);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TradingSideTransactionReporting1.mmObject();
		}

		@Override
		public List<TradingSideTransactionReporting1> getValue(RegulatoryReporting4 obj) {
			return obj.getTradingSideTransactionReporting();
		}

		@Override
		public void setValue(RegulatoryReporting4 obj, List<TradingSideTransactionReporting1> value) {
			obj.setTradingSideTransactionReporting(value);
		}
	};
	@XmlElement(name = "CtrPtySdTxRptg")
	protected List<CounterpartySideTransactionReporting1> counterpartySideTransactionReporting;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CounterpartySideTransactionReporting1
	 * CounterpartySideTransactionReporting1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReport
	 * RegulatoryReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtySdTxRptg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartySideTransactionReporting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Regulatory transaction reporting information from the Counterparty Side party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmCounterpartySideTransactionReporting
	 * RegulatoryReporting6.mmCounterpartySideTransactionReporting}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RegulatoryReporting4, List<CounterpartySideTransactionReporting1>> mmCounterpartySideTransactionReporting = new MMMessageAssociationEnd<RegulatoryReporting4, List<CounterpartySideTransactionReporting1>>() {
		{
			businessComponentTrace_lazy = () -> RegulatoryReport.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "CtrPtySdTxRptg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartySideTransactionReporting";
			definition = "Regulatory transaction reporting information from the Counterparty Side party.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmCounterpartySideTransactionReporting);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CounterpartySideTransactionReporting1.mmObject();
		}

		@Override
		public List<CounterpartySideTransactionReporting1> getValue(RegulatoryReporting4 obj) {
			return obj.getCounterpartySideTransactionReporting();
		}

		@Override
		public void setValue(RegulatoryReporting4 obj, List<CounterpartySideTransactionReporting1> value) {
			obj.setCounterpartySideTransactionReporting(value);
		}
	};
	@XmlElement(name = "CntrlCtrPtyClrHs")
	protected PartyIdentification73Choice centralCounterpartyClearingHouse;
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CntrlCtrPtyClrHs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralCounterpartyClearingHouse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies an agency or separate corporation of a futures exchange responsible for settling and\r\nclearing trades, collecting and maintaining margins, regulating delivery and reporting trade data. This can also be known as a Central Counterparty (CCP)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmCentralCounterpartyClearingHouse
	 * RegulatoryReporting6.mmCentralCounterpartyClearingHouse}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RegulatoryReporting4, Optional<PartyIdentification73Choice>> mmCentralCounterpartyClearingHouse = new MMMessageAssociationEnd<RegulatoryReporting4, Optional<PartyIdentification73Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "CntrlCtrPtyClrHs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralCounterpartyClearingHouse";
			definition = "Identifies an agency or separate corporation of a futures exchange responsible for settling and\r\nclearing trades, collecting and maintaining margins, regulating delivery and reporting trade data. This can also be known as a Central Counterparty (CCP).";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmCentralCounterpartyClearingHouse);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification73Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification73Choice> getValue(RegulatoryReporting4 obj) {
			return obj.getCentralCounterpartyClearingHouse();
		}

		@Override
		public void setValue(RegulatoryReporting4 obj, Optional<PartyIdentification73Choice> value) {
			obj.setCentralCounterpartyClearingHouse(value.orElse(null));
		}
	};
	@XmlElement(name = "ClrBrkr")
	protected PartyIdentification73Choice clearingBroker;
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrBrkr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingBroker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the party that is a member of the clearing house (CCP) and that acts as a liaison between the investor and the Cntral Counterparty (CCP)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmClearingBroker
	 * RegulatoryReporting6.mmClearingBroker}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RegulatoryReporting4, Optional<PartyIdentification73Choice>> mmClearingBroker = new MMMessageAssociationEnd<RegulatoryReporting4, Optional<PartyIdentification73Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "ClrBrkr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingBroker";
			definition = "Identifies the party that is a member of the clearing house (CCP) and that acts as a liaison between the investor and the Cntral Counterparty (CCP).";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmClearingBroker);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification73Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification73Choice> getValue(RegulatoryReporting4 obj) {
			return obj.getClearingBroker();
		}

		@Override
		public void setValue(RegulatoryReporting4 obj, Optional<PartyIdentification73Choice> value) {
			obj.setClearingBroker(value.orElse(null));
		}
	};
	@XmlElement(name = "ClrXcptnPty")
	protected PartyIdentification73Choice clearingExceptionParty;
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrXcptnPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingExceptionParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the party that is exempt from a clearing obligation."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmClearingExceptionParty
	 * RegulatoryReporting6.mmClearingExceptionParty}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RegulatoryReporting4, Optional<PartyIdentification73Choice>> mmClearingExceptionParty = new MMMessageAttribute<RegulatoryReporting4, Optional<PartyIdentification73Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "ClrXcptnPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingExceptionParty";
			definition = "Identifies the party that is exempt from a clearing obligation.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmClearingExceptionParty);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification73Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification73Choice> getValue(RegulatoryReporting4 obj) {
			return obj.getClearingExceptionParty();
		}

		@Override
		public void setValue(RegulatoryReporting4 obj, Optional<PartyIdentification73Choice> value) {
			obj.setClearingExceptionParty(value.orElse(null));
		}
	};
	@XmlElement(name = "ClrBrkrId")
	protected ClearingBrokerIdentification1 clearingBrokerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ClearingBrokerIdentification1
	 * ClearingBrokerIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmClearingBrokerIdentification
	 * TradeIdentification.mmClearingBrokerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrBrkrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingBrokerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reference number assigned by the clearing broker. A distinction can be made between the reference for the Central Counterparty (CCP) leg and the reference for the client leg of the transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmClearingBrokerIdentification
	 * RegulatoryReporting6.mmClearingBrokerIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RegulatoryReporting4, Optional<ClearingBrokerIdentification1>> mmClearingBrokerIdentification = new MMMessageAttribute<RegulatoryReporting4, Optional<ClearingBrokerIdentification1>>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmClearingBrokerIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "ClrBrkrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingBrokerIdentification";
			definition = "Specifies the reference number assigned by the clearing broker. A distinction can be made between the reference for the Central Counterparty (CCP) leg and the reference for the client leg of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmClearingBrokerIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ClearingBrokerIdentification1.mmObject();
		}

		@Override
		public Optional<ClearingBrokerIdentification1> getValue(RegulatoryReporting4 obj) {
			return obj.getClearingBrokerIdentification();
		}

		@Override
		public void setValue(RegulatoryReporting4 obj, Optional<ClearingBrokerIdentification1> value) {
			obj.setClearingBrokerIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "ClrThrshldInd")
	protected YesNoIndicator clearingThresholdIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Clearing#mmClearingThresholdIndicator
	 * Clearing.mmClearingThresholdIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrThrshldInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingThresholdIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the contract is above or below the clearing threshold. Where No indicates the contract is below the clearing threshold and Yes indicates the contract is above the clearing threshold."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmClearingThresholdIndicator
	 * RegulatoryReporting6.mmClearingThresholdIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RegulatoryReporting4, Optional<YesNoIndicator>> mmClearingThresholdIndicator = new MMMessageAttribute<RegulatoryReporting4, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Clearing.mmClearingThresholdIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "ClrThrshldInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingThresholdIndicator";
			definition = "Specifies whether the contract is above or below the clearing threshold. Where No indicates the contract is below the clearing threshold and Yes indicates the contract is above the clearing threshold.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmClearingThresholdIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(RegulatoryReporting4 obj) {
			return obj.getClearingThresholdIndicator();
		}

		@Override
		public void setValue(RegulatoryReporting4 obj, Optional<YesNoIndicator> value) {
			obj.setClearingThresholdIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "ClrdPdctId")
	protected Max35Text clearedProductIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.Clearing#mmClearedIdentification
	 * Clearing.mmClearedIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrdPdctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearedProductIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reference number assigned by the Central Counterparty (CCP)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmClearedProductIdentification
	 * RegulatoryReporting6.mmClearedProductIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RegulatoryReporting4, Optional<Max35Text>> mmClearedProductIdentification = new MMMessageAttribute<RegulatoryReporting4, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Clearing.mmClearedIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "ClrdPdctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearedProductIdentification";
			definition = "Specifies the reference number assigned by the Central Counterparty (CCP).";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmClearedProductIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(RegulatoryReporting4 obj) {
			return obj.getClearedProductIdentification();
		}

		@Override
		public void setValue(RegulatoryReporting4 obj, Optional<Max35Text> value) {
			obj.setClearedProductIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "UndrlygPdctIdr")
	protected UnderlyingProductIdentifier1Code underlyingProductIdentifier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingProductIdentifier1Code
	 * UnderlyingProductIdentifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReport#mmUnderlyingProduct
	 * RegulatoryReport.mmUnderlyingProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygPdctIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingProductIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the underlying product type."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmUnderlyingProductIdentifier
	 * RegulatoryReporting6.mmUnderlyingProductIdentifier}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RegulatoryReporting4, Optional<UnderlyingProductIdentifier1Code>> mmUnderlyingProductIdentifier = new MMMessageAttribute<RegulatoryReporting4, Optional<UnderlyingProductIdentifier1Code>>() {
		{
			businessElementTrace_lazy = () -> RegulatoryReport.mmUnderlyingProduct;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "UndrlygPdctIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingProductIdentifier";
			definition = "Specifies the underlying product type.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmUnderlyingProductIdentifier);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> UnderlyingProductIdentifier1Code.mmObject();
		}

		@Override
		public Optional<UnderlyingProductIdentifier1Code> getValue(RegulatoryReporting4 obj) {
			return obj.getUnderlyingProductIdentifier();
		}

		@Override
		public void setValue(RegulatoryReporting4 obj, Optional<UnderlyingProductIdentifier1Code> value) {
			obj.setUnderlyingProductIdentifier(value.orElse(null));
		}
	};
	@XmlElement(name = "AllcnInd")
	protected AllocationIndicator1Code allocationIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AllocationIndicator1Code
	 * AllocationIndicator1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmAllocationIndicator
	 * Trade.mmAllocationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllcnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the trade is a pre-allocation or a post-allocation trade, or whether the trade is unallocated."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmAllocationIndicator
	 * RegulatoryReporting6.mmAllocationIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RegulatoryReporting4, Optional<AllocationIndicator1Code>> mmAllocationIndicator = new MMMessageAttribute<RegulatoryReporting4, Optional<AllocationIndicator1Code>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmAllocationIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "AllcnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationIndicator";
			definition = "Specifies whether the trade is a pre-allocation or a post-allocation trade, or whether the trade is unallocated.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmAllocationIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AllocationIndicator1Code.mmObject();
		}

		@Override
		public Optional<AllocationIndicator1Code> getValue(RegulatoryReporting4 obj) {
			return obj.getAllocationIndicator();
		}

		@Override
		public void setValue(RegulatoryReporting4 obj, Optional<AllocationIndicator1Code> value) {
			obj.setAllocationIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "CollstnInd")
	protected CollateralisationIndicator1Code collateralisationIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralisationIndicator1Code
	 * CollateralisationIndicator1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmCollateralisationType
	 * Trade.mmCollateralisationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollstnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralisationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the transaction is collateralised."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmCollateralisationIndicator
	 * RegulatoryReporting6.mmCollateralisationIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RegulatoryReporting4, Optional<CollateralisationIndicator1Code>> mmCollateralisationIndicator = new MMMessageAttribute<RegulatoryReporting4, Optional<CollateralisationIndicator1Code>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmCollateralisationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "CollstnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralisationIndicator";
			definition = "Specifies whether the transaction is collateralised.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmCollateralisationIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CollateralisationIndicator1Code.mmObject();
		}

		@Override
		public Optional<CollateralisationIndicator1Code> getValue(RegulatoryReporting4 obj) {
			return obj.getCollateralisationIndicator();
		}

		@Override
		public void setValue(RegulatoryReporting4 obj, Optional<CollateralisationIndicator1Code> value) {
			obj.setCollateralisationIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "ExctnVn")
	protected Max35Text executionVenue;
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExctnVn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutionVenue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the trading venue of the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmExecutionVenue
	 * RegulatoryReporting6.mmExecutionVenue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RegulatoryReporting4, Optional<Max35Text>> mmExecutionVenue = new MMMessageAttribute<RegulatoryReporting4, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "ExctnVn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutionVenue";
			definition = "Specifies the trading venue of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmExecutionVenue);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(RegulatoryReporting4 obj) {
			return obj.getExecutionVenue();
		}

		@Override
		public void setValue(RegulatoryReporting4 obj, Optional<Max35Text> value) {
			obj.setExecutionVenue(value.orElse(null));
		}
	};
	@XmlElement(name = "ExctnTmstmp")
	protected DateAndDateTimeChoice executionTimestamp;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExctnTmstmp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutionTimestamp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the date and time of the execution of the transaction in Coordinated Universal Time (UTC)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmExecutionTimestamp
	 * RegulatoryReporting6.mmExecutionTimestamp}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RegulatoryReporting4, Optional<DateAndDateTimeChoice>> mmExecutionTimestamp = new MMMessageAttribute<RegulatoryReporting4, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "ExctnTmstmp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutionTimestamp";
			definition = "Specifies the date and time of the execution of the transaction in Coordinated Universal Time (UTC).";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmExecutionTimestamp);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(RegulatoryReporting4 obj) {
			return obj.getExecutionTimestamp();
		}

		@Override
		public void setValue(RegulatoryReporting4 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setExecutionTimestamp(value.orElse(null));
		}
	};
	@XmlElement(name = "NonStdFlg")
	protected YesNoIndicator nonStandardFlag;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReport#mmNonStandardFlag
	 * RegulatoryReport.mmNonStandardFlag}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonStdFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonStandardFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the reportable transaction has one or more additional terms or provisions, other than those listed in the required real-time data fields, that materially affects the price of the reportable transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmNonStandardFlag
	 * RegulatoryReporting6.mmNonStandardFlag}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RegulatoryReporting4, Optional<YesNoIndicator>> mmNonStandardFlag = new MMMessageAttribute<RegulatoryReporting4, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> RegulatoryReport.mmNonStandardFlag;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "NonStdFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonStandardFlag";
			definition = "Specifies whether the reportable transaction has one or more additional terms or provisions, other than those listed in the required real-time data fields, that materially affects the price of the reportable transaction.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmNonStandardFlag);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(RegulatoryReporting4 obj) {
			return obj.getNonStandardFlag();
		}

		@Override
		public void setValue(RegulatoryReporting4 obj, Optional<YesNoIndicator> value) {
			obj.setNonStandardFlag(value.orElse(null));
		}
	};
	@XmlElement(name = "LkSwpId")
	protected Exact42Text linkSwapIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Exact42Text
	 * Exact42Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeSwap#mmLinkSwapIdentification
	 * ForeignExchangeSwap.mmLinkSwapIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkSwpId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkSwapIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the common reference or correlation identification for a swap transaction where the near and far leg are confirmed separately."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmLinkSwapIdentification
	 * RegulatoryReporting6.mmLinkSwapIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RegulatoryReporting4, Optional<Exact42Text>> mmLinkSwapIdentification = new MMMessageAttribute<RegulatoryReporting4, Optional<Exact42Text>>() {
		{
			businessElementTrace_lazy = () -> ForeignExchangeSwap.mmLinkSwapIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "LkSwpId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkSwapIdentification";
			definition = "Specifies the common reference or correlation identification for a swap transaction where the near and far leg are confirmed separately.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmLinkSwapIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact42Text.mmObject();
		}

		@Override
		public Optional<Exact42Text> getValue(RegulatoryReporting4 obj) {
			return obj.getLinkSwapIdentification();
		}

		@Override
		public void setValue(RegulatoryReporting4 obj, Optional<Exact42Text> value) {
			obj.setLinkSwapIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "FinNtrOfTheCtrPtyInd")
	protected YesNoIndicator financialNatureOfTheCounterpartyIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinNtrOfTheCtrPtyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialNatureOfTheCounterpartyIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the financial nature of the reporting counterparty."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmFinancialNatureOfTheCounterpartyIndicator
	 * RegulatoryReporting6.mmFinancialNatureOfTheCounterpartyIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RegulatoryReporting4, Optional<YesNoIndicator>> mmFinancialNatureOfTheCounterpartyIndicator = new MMMessageAttribute<RegulatoryReporting4, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "FinNtrOfTheCtrPtyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialNatureOfTheCounterpartyIndicator";
			definition = "Specifies the financial nature of the reporting counterparty.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmFinancialNatureOfTheCounterpartyIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(RegulatoryReporting4 obj) {
			return obj.getFinancialNatureOfTheCounterpartyIndicator();
		}

		@Override
		public void setValue(RegulatoryReporting4 obj, Optional<YesNoIndicator> value) {
			obj.setFinancialNatureOfTheCounterpartyIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "CollPrtflInd")
	protected YesNoIndicator collateralPortfolioIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollPrtflInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralPortfolioIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the collateral is posted on a portfolio basis."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmCollateralPortfolioIndicator
	 * RegulatoryReporting6.mmCollateralPortfolioIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RegulatoryReporting4, Optional<YesNoIndicator>> mmCollateralPortfolioIndicator = new MMMessageAttribute<RegulatoryReporting4, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "CollPrtflInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralPortfolioIndicator";
			definition = "Specifies if the collateral is posted on a portfolio basis.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmCollateralPortfolioIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(RegulatoryReporting4 obj) {
			return obj.getCollateralPortfolioIndicator();
		}

		@Override
		public void setValue(RegulatoryReporting4 obj, Optional<YesNoIndicator> value) {
			obj.setCollateralPortfolioIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "CollPrtflCd")
	protected Max10Text collateralPortfolioCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max10Text
	 * Max10Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollPrtflCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralPortfolioCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the portfolio code to which the trade belongs if the collateral is posted on a portfolio basis (and not trade by trade)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmCollateralPortfolioCode
	 * RegulatoryReporting6.mmCollateralPortfolioCode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RegulatoryReporting4, Optional<Max10Text>> mmCollateralPortfolioCode = new MMMessageAttribute<RegulatoryReporting4, Optional<Max10Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "CollPrtflCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralPortfolioCode";
			definition = "Identifies the portfolio code to which the trade belongs if the collateral is posted on a portfolio basis (and not trade by trade).";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmCollateralPortfolioCode);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10Text.mmObject();
		}

		@Override
		public Optional<Max10Text> getValue(RegulatoryReporting4 obj) {
			return obj.getCollateralPortfolioCode();
		}

		@Override
		public void setValue(RegulatoryReporting4 obj, Optional<Max10Text> value) {
			obj.setCollateralPortfolioCode(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtflCmprssnInd")
	protected YesNoIndicator portfolioCompressionIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtflCmprssnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortfolioCompressionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the trade results from portfolio compression."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmPortfolioCompressionIndicator
	 * RegulatoryReporting6.mmPortfolioCompressionIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RegulatoryReporting4, Optional<YesNoIndicator>> mmPortfolioCompressionIndicator = new MMMessageAttribute<RegulatoryReporting4, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "PrtflCmprssnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioCompressionIndicator";
			definition = "Indicates if the trade results from portfolio compression.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmPortfolioCompressionIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(RegulatoryReporting4 obj) {
			return obj.getPortfolioCompressionIndicator();
		}

		@Override
		public void setValue(RegulatoryReporting4 obj, Optional<YesNoIndicator> value) {
			obj.setPortfolioCompressionIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "CorpSctrInd")
	protected CorporateSectorIdentifier1Code corporateSectorIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifier1Code
	 * CorporateSectorIdentifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpSctrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateSectorIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the corporate sector of the counterparty."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmCorporateSectorIndicator
	 * RegulatoryReporting6.mmCorporateSectorIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RegulatoryReporting4, Optional<CorporateSectorIdentifier1Code>> mmCorporateSectorIndicator = new MMMessageAttribute<RegulatoryReporting4, Optional<CorporateSectorIdentifier1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "CorpSctrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateSectorIndicator";
			definition = "Specifies the corporate sector of the counterparty.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmCorporateSectorIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CorporateSectorIdentifier1Code.mmObject();
		}

		@Override
		public Optional<CorporateSectorIdentifier1Code> getValue(RegulatoryReporting4 obj) {
			return obj.getCorporateSectorIndicator();
		}

		@Override
		public void setValue(RegulatoryReporting4 obj, Optional<CorporateSectorIdentifier1Code> value) {
			obj.setCorporateSectorIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "TradWthNonEEACtrPtyInd")
	protected YesNoIndicator tradeWithNonEEACounterpartyIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradWthNonEEACtrPtyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeWithNonEEACounterpartyIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the counterparty has entered into a trade with a non-European Economic Area (EEA) counterparty that is not subject to the reporting obligation."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmTradeWithNonEEACounterpartyIndicator
	 * RegulatoryReporting6.mmTradeWithNonEEACounterpartyIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RegulatoryReporting4, Optional<YesNoIndicator>> mmTradeWithNonEEACounterpartyIndicator = new MMMessageAttribute<RegulatoryReporting4, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "TradWthNonEEACtrPtyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeWithNonEEACounterpartyIndicator";
			definition = "Specifies whether the counterparty has entered into a trade with a non-European Economic Area (EEA) counterparty that is not subject to the reporting obligation.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmTradeWithNonEEACounterpartyIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(RegulatoryReporting4 obj) {
			return obj.getTradeWithNonEEACounterpartyIndicator();
		}

		@Override
		public void setValue(RegulatoryReporting4 obj, Optional<YesNoIndicator> value) {
			obj.setTradeWithNonEEACounterpartyIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "NtrgrpTradInd")
	protected YesNoIndicator intragroupTradeIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtrgrpTradInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntragroupTradeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "To indicate if a reported trade falls under the definition of intragroup transaction, as defined by European Securities and Markets Authority (ESMA) in the Technical Standards."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmIntragroupTradeIndicator
	 * RegulatoryReporting6.mmIntragroupTradeIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RegulatoryReporting4, Optional<YesNoIndicator>> mmIntragroupTradeIndicator = new MMMessageAttribute<RegulatoryReporting4, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "NtrgrpTradInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntragroupTradeIndicator";
			definition = "To indicate if a reported trade falls under the definition of intragroup transaction, as defined by European Securities and Markets Authority (ESMA) in the Technical Standards.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmIntragroupTradeIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(RegulatoryReporting4 obj) {
			return obj.getIntragroupTradeIndicator();
		}

		@Override
		public void setValue(RegulatoryReporting4 obj, Optional<YesNoIndicator> value) {
			obj.setIntragroupTradeIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "ComrclOrTrsrFincgInd")
	protected YesNoIndicator commercialOrTreasuryFinancingIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComrclOrTrsrFincgInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialOrTreasuryFinancingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the contract is objectively measurable as directly linked to the non-financial counterparty's commercial or treasury financing activity."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmCommercialOrTreasuryFinancingIndicator
	 * RegulatoryReporting6.mmCommercialOrTreasuryFinancingIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RegulatoryReporting4, Optional<YesNoIndicator>> mmCommercialOrTreasuryFinancingIndicator = new MMMessageAttribute<RegulatoryReporting4, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "ComrclOrTrsrFincgInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialOrTreasuryFinancingIndicator";
			definition = "Specifies whether the contract is objectively measurable as directly linked to the non-financial counterparty's commercial or treasury financing activity.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmCommercialOrTreasuryFinancingIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(RegulatoryReporting4 obj) {
			return obj.getCommercialOrTreasuryFinancingIndicator();
		}

		@Override
		public void setValue(RegulatoryReporting4 obj, Optional<YesNoIndicator> value) {
			obj.setCommercialOrTreasuryFinancingIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlRptgInf")
	protected Max210Text additionalReportingInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max210Text
	 * Max210Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlRptgInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReportingInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies additional information that might be required by the regulator."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmAdditionalReportingInformation
	 * RegulatoryReporting6.mmAdditionalReportingInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RegulatoryReporting4, Optional<Max210Text>> mmAdditionalReportingInformation = new MMMessageAttribute<RegulatoryReporting4, Optional<Max210Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "AddtlRptgInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReportingInformation";
			definition = "Specifies additional information that might be required by the regulator.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmAdditionalReportingInformation);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max210Text.mmObject();
		}

		@Override
		public Optional<Max210Text> getValue(RegulatoryReporting4 obj) {
			return obj.getAdditionalReportingInformation();
		}

		@Override
		public void setValue(RegulatoryReporting4 obj, Optional<Max210Text> value) {
			obj.setAdditionalReportingInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegulatoryReporting4.mmTradingSideTransactionReporting, com.tools20022.repository.msg.RegulatoryReporting4.mmCounterpartySideTransactionReporting,
						com.tools20022.repository.msg.RegulatoryReporting4.mmCentralCounterpartyClearingHouse, com.tools20022.repository.msg.RegulatoryReporting4.mmClearingBroker,
						com.tools20022.repository.msg.RegulatoryReporting4.mmClearingExceptionParty, com.tools20022.repository.msg.RegulatoryReporting4.mmClearingBrokerIdentification,
						com.tools20022.repository.msg.RegulatoryReporting4.mmClearingThresholdIndicator, com.tools20022.repository.msg.RegulatoryReporting4.mmClearedProductIdentification,
						com.tools20022.repository.msg.RegulatoryReporting4.mmUnderlyingProductIdentifier, com.tools20022.repository.msg.RegulatoryReporting4.mmAllocationIndicator,
						com.tools20022.repository.msg.RegulatoryReporting4.mmCollateralisationIndicator, com.tools20022.repository.msg.RegulatoryReporting4.mmExecutionVenue,
						com.tools20022.repository.msg.RegulatoryReporting4.mmExecutionTimestamp, com.tools20022.repository.msg.RegulatoryReporting4.mmNonStandardFlag,
						com.tools20022.repository.msg.RegulatoryReporting4.mmLinkSwapIdentification, com.tools20022.repository.msg.RegulatoryReporting4.mmFinancialNatureOfTheCounterpartyIndicator,
						com.tools20022.repository.msg.RegulatoryReporting4.mmCollateralPortfolioIndicator, com.tools20022.repository.msg.RegulatoryReporting4.mmCollateralPortfolioCode,
						com.tools20022.repository.msg.RegulatoryReporting4.mmPortfolioCompressionIndicator, com.tools20022.repository.msg.RegulatoryReporting4.mmCorporateSectorIndicator,
						com.tools20022.repository.msg.RegulatoryReporting4.mmTradeWithNonEEACounterpartyIndicator, com.tools20022.repository.msg.RegulatoryReporting4.mmIntragroupTradeIndicator,
						com.tools20022.repository.msg.RegulatoryReporting4.mmCommercialOrTreasuryFinancingIndicator, com.tools20022.repository.msg.RegulatoryReporting4.mmAdditionalReportingInformation);
				trace_lazy = () -> RegulatoryReport.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RegulatoryReporting4";
				definition = "Includes data elements that can be used for reporting to trade repositories, it is not to be used on regular trade confirmations. Although some fields, for example, unique transaction identifier and prior unique transaction identifier, might be used on regular trade confirmations.";
				nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<TradingSideTransactionReporting1> getTradingSideTransactionReporting() {
		return tradingSideTransactionReporting == null ? tradingSideTransactionReporting = new ArrayList<>() : tradingSideTransactionReporting;
	}

	public RegulatoryReporting4 setTradingSideTransactionReporting(List<TradingSideTransactionReporting1> tradingSideTransactionReporting) {
		this.tradingSideTransactionReporting = Objects.requireNonNull(tradingSideTransactionReporting);
		return this;
	}

	public List<CounterpartySideTransactionReporting1> getCounterpartySideTransactionReporting() {
		return counterpartySideTransactionReporting == null ? counterpartySideTransactionReporting = new ArrayList<>() : counterpartySideTransactionReporting;
	}

	public RegulatoryReporting4 setCounterpartySideTransactionReporting(List<CounterpartySideTransactionReporting1> counterpartySideTransactionReporting) {
		this.counterpartySideTransactionReporting = Objects.requireNonNull(counterpartySideTransactionReporting);
		return this;
	}

	public Optional<PartyIdentification73Choice> getCentralCounterpartyClearingHouse() {
		return centralCounterpartyClearingHouse == null ? Optional.empty() : Optional.of(centralCounterpartyClearingHouse);
	}

	public RegulatoryReporting4 setCentralCounterpartyClearingHouse(PartyIdentification73Choice centralCounterpartyClearingHouse) {
		this.centralCounterpartyClearingHouse = centralCounterpartyClearingHouse;
		return this;
	}

	public Optional<PartyIdentification73Choice> getClearingBroker() {
		return clearingBroker == null ? Optional.empty() : Optional.of(clearingBroker);
	}

	public RegulatoryReporting4 setClearingBroker(PartyIdentification73Choice clearingBroker) {
		this.clearingBroker = clearingBroker;
		return this;
	}

	public Optional<PartyIdentification73Choice> getClearingExceptionParty() {
		return clearingExceptionParty == null ? Optional.empty() : Optional.of(clearingExceptionParty);
	}

	public RegulatoryReporting4 setClearingExceptionParty(PartyIdentification73Choice clearingExceptionParty) {
		this.clearingExceptionParty = clearingExceptionParty;
		return this;
	}

	public Optional<ClearingBrokerIdentification1> getClearingBrokerIdentification() {
		return clearingBrokerIdentification == null ? Optional.empty() : Optional.of(clearingBrokerIdentification);
	}

	public RegulatoryReporting4 setClearingBrokerIdentification(ClearingBrokerIdentification1 clearingBrokerIdentification) {
		this.clearingBrokerIdentification = clearingBrokerIdentification;
		return this;
	}

	public Optional<YesNoIndicator> getClearingThresholdIndicator() {
		return clearingThresholdIndicator == null ? Optional.empty() : Optional.of(clearingThresholdIndicator);
	}

	public RegulatoryReporting4 setClearingThresholdIndicator(YesNoIndicator clearingThresholdIndicator) {
		this.clearingThresholdIndicator = clearingThresholdIndicator;
		return this;
	}

	public Optional<Max35Text> getClearedProductIdentification() {
		return clearedProductIdentification == null ? Optional.empty() : Optional.of(clearedProductIdentification);
	}

	public RegulatoryReporting4 setClearedProductIdentification(Max35Text clearedProductIdentification) {
		this.clearedProductIdentification = clearedProductIdentification;
		return this;
	}

	public Optional<UnderlyingProductIdentifier1Code> getUnderlyingProductIdentifier() {
		return underlyingProductIdentifier == null ? Optional.empty() : Optional.of(underlyingProductIdentifier);
	}

	public RegulatoryReporting4 setUnderlyingProductIdentifier(UnderlyingProductIdentifier1Code underlyingProductIdentifier) {
		this.underlyingProductIdentifier = underlyingProductIdentifier;
		return this;
	}

	public Optional<AllocationIndicator1Code> getAllocationIndicator() {
		return allocationIndicator == null ? Optional.empty() : Optional.of(allocationIndicator);
	}

	public RegulatoryReporting4 setAllocationIndicator(AllocationIndicator1Code allocationIndicator) {
		this.allocationIndicator = allocationIndicator;
		return this;
	}

	public Optional<CollateralisationIndicator1Code> getCollateralisationIndicator() {
		return collateralisationIndicator == null ? Optional.empty() : Optional.of(collateralisationIndicator);
	}

	public RegulatoryReporting4 setCollateralisationIndicator(CollateralisationIndicator1Code collateralisationIndicator) {
		this.collateralisationIndicator = collateralisationIndicator;
		return this;
	}

	public Optional<Max35Text> getExecutionVenue() {
		return executionVenue == null ? Optional.empty() : Optional.of(executionVenue);
	}

	public RegulatoryReporting4 setExecutionVenue(Max35Text executionVenue) {
		this.executionVenue = executionVenue;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getExecutionTimestamp() {
		return executionTimestamp == null ? Optional.empty() : Optional.of(executionTimestamp);
	}

	public RegulatoryReporting4 setExecutionTimestamp(DateAndDateTimeChoice executionTimestamp) {
		this.executionTimestamp = executionTimestamp;
		return this;
	}

	public Optional<YesNoIndicator> getNonStandardFlag() {
		return nonStandardFlag == null ? Optional.empty() : Optional.of(nonStandardFlag);
	}

	public RegulatoryReporting4 setNonStandardFlag(YesNoIndicator nonStandardFlag) {
		this.nonStandardFlag = nonStandardFlag;
		return this;
	}

	public Optional<Exact42Text> getLinkSwapIdentification() {
		return linkSwapIdentification == null ? Optional.empty() : Optional.of(linkSwapIdentification);
	}

	public RegulatoryReporting4 setLinkSwapIdentification(Exact42Text linkSwapIdentification) {
		this.linkSwapIdentification = linkSwapIdentification;
		return this;
	}

	public Optional<YesNoIndicator> getFinancialNatureOfTheCounterpartyIndicator() {
		return financialNatureOfTheCounterpartyIndicator == null ? Optional.empty() : Optional.of(financialNatureOfTheCounterpartyIndicator);
	}

	public RegulatoryReporting4 setFinancialNatureOfTheCounterpartyIndicator(YesNoIndicator financialNatureOfTheCounterpartyIndicator) {
		this.financialNatureOfTheCounterpartyIndicator = financialNatureOfTheCounterpartyIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getCollateralPortfolioIndicator() {
		return collateralPortfolioIndicator == null ? Optional.empty() : Optional.of(collateralPortfolioIndicator);
	}

	public RegulatoryReporting4 setCollateralPortfolioIndicator(YesNoIndicator collateralPortfolioIndicator) {
		this.collateralPortfolioIndicator = collateralPortfolioIndicator;
		return this;
	}

	public Optional<Max10Text> getCollateralPortfolioCode() {
		return collateralPortfolioCode == null ? Optional.empty() : Optional.of(collateralPortfolioCode);
	}

	public RegulatoryReporting4 setCollateralPortfolioCode(Max10Text collateralPortfolioCode) {
		this.collateralPortfolioCode = collateralPortfolioCode;
		return this;
	}

	public Optional<YesNoIndicator> getPortfolioCompressionIndicator() {
		return portfolioCompressionIndicator == null ? Optional.empty() : Optional.of(portfolioCompressionIndicator);
	}

	public RegulatoryReporting4 setPortfolioCompressionIndicator(YesNoIndicator portfolioCompressionIndicator) {
		this.portfolioCompressionIndicator = portfolioCompressionIndicator;
		return this;
	}

	public Optional<CorporateSectorIdentifier1Code> getCorporateSectorIndicator() {
		return corporateSectorIndicator == null ? Optional.empty() : Optional.of(corporateSectorIndicator);
	}

	public RegulatoryReporting4 setCorporateSectorIndicator(CorporateSectorIdentifier1Code corporateSectorIndicator) {
		this.corporateSectorIndicator = corporateSectorIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getTradeWithNonEEACounterpartyIndicator() {
		return tradeWithNonEEACounterpartyIndicator == null ? Optional.empty() : Optional.of(tradeWithNonEEACounterpartyIndicator);
	}

	public RegulatoryReporting4 setTradeWithNonEEACounterpartyIndicator(YesNoIndicator tradeWithNonEEACounterpartyIndicator) {
		this.tradeWithNonEEACounterpartyIndicator = tradeWithNonEEACounterpartyIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getIntragroupTradeIndicator() {
		return intragroupTradeIndicator == null ? Optional.empty() : Optional.of(intragroupTradeIndicator);
	}

	public RegulatoryReporting4 setIntragroupTradeIndicator(YesNoIndicator intragroupTradeIndicator) {
		this.intragroupTradeIndicator = intragroupTradeIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getCommercialOrTreasuryFinancingIndicator() {
		return commercialOrTreasuryFinancingIndicator == null ? Optional.empty() : Optional.of(commercialOrTreasuryFinancingIndicator);
	}

	public RegulatoryReporting4 setCommercialOrTreasuryFinancingIndicator(YesNoIndicator commercialOrTreasuryFinancingIndicator) {
		this.commercialOrTreasuryFinancingIndicator = commercialOrTreasuryFinancingIndicator;
		return this;
	}

	public Optional<Max210Text> getAdditionalReportingInformation() {
		return additionalReportingInformation == null ? Optional.empty() : Optional.of(additionalReportingInformation);
	}

	public RegulatoryReporting4 setAdditionalReportingInformation(Max210Text additionalReportingInformation) {
		this.additionalReportingInformation = additionalReportingInformation;
		return this;
	}
}