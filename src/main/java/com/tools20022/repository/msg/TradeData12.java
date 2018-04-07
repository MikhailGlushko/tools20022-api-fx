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
import com.tools20022.repository.area.fxtr.ForeignExchangeTradeBulkStatusNotificationV04;
import com.tools20022.repository.choice.Status28Choice;
import com.tools20022.repository.codeset.StatusSubType2Code;
import com.tools20022.repository.datatype.Exact4AlphaNumericText;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.StatusAndSubStatus2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information on the status of a trade.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData12#mmMessageIdentification
 * TradeData12.mmMessageIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData12#mmStatusOriginator
 * TradeData12.mmStatusOriginator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData12#mmCurrentStatus
 * TradeData12.mmCurrentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData12#mmCurrentStatusSubType
 * TradeData12.mmCurrentStatusSubType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData12#mmCurrentStatusDateTime
 * TradeData12.mmCurrentStatusDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData12#mmPreviousStatus
 * TradeData12.mmPreviousStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData12#mmPreviousStatusSubType
 * TradeData12.mmPreviousStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData12#mmProductType
 * TradeData12.mmProductType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData12#mmSettlementSessionIdentifier
 * TradeData12.mmSettlementSessionIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData12#mmLinkedReportIdentification
 * TradeData12.mmLinkedReportIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
 * TreasuryTradeSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeBulkStatusNotificationV04#mmStatusDetails
 * ForeignExchangeTradeBulkStatusNotificationV04.mmStatusDetails}</li>
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
 * "TradeData12"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information on the status of a trade."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeData12", propOrder = {"messageIdentification", "statusOriginator", "currentStatus", "currentStatusSubType", "currentStatusDateTime", "previousStatus", "previousStatusSubType", "productType",
		"settlementSessionIdentifier", "linkedReportIdentification"})
public class TradeData12 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgId", required = true)
	protected Max35Text messageIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeData12 TradeData12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the present message assigned by the party issuing the message. This identification must be unique amongst all messages of same type sent by the same party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeData12, Max35Text> mmMessageIdentification = new MMMessageAttribute<TradeData12, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData12.mmObject();
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Identification of the present message assigned by the party issuing the message. This identification must be unique amongst all messages of same type sent by the same party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(TradeData12 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(TradeData12 obj, Max35Text value) {
			obj.setMessageIdentification(value);
		}
	};
	@XmlElement(name = "StsOrgtr")
	protected Max35Text statusOriginator;
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
	 * {@linkplain com.tools20022.repository.msg.TradeData12 TradeData12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsOrgtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusOriginator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that assigned the status to the foreign exchange trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeData12, Optional<Max35Text>> mmStatusOriginator = new MMMessageAttribute<TradeData12, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData12.mmObject();
			isDerived = false;
			xmlTag = "StsOrgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusOriginator";
			definition = "Party that assigned the status to the foreign exchange trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TradeData12 obj) {
			return obj.getStatusOriginator();
		}

		@Override
		public void setValue(TradeData12 obj, Optional<Max35Text> value) {
			obj.setStatusOriginator(value.orElse(null));
		}
	};
	@XmlElement(name = "CurSts", required = true)
	protected StatusAndSubStatus2 currentStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.StatusAndSubStatus2
	 * StatusAndSubStatus2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeData12 TradeData12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the new status of the trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeData12, StatusAndSubStatus2> mmCurrentStatus = new MMMessageAttribute<TradeData12, StatusAndSubStatus2>() {
		{
			businessComponentTrace_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData12.mmObject();
			isDerived = false;
			xmlTag = "CurSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentStatus";
			definition = "Specifies the new status of the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> StatusAndSubStatus2.mmObject();
		}

		@Override
		public StatusAndSubStatus2 getValue(TradeData12 obj) {
			return obj.getCurrentStatus();
		}

		@Override
		public void setValue(TradeData12 obj, StatusAndSubStatus2 value) {
			obj.setCurrentStatus(value);
		}
	};
	@XmlElement(name = "CurStsSubTp")
	protected StatusSubType2Code currentStatusSubType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.StatusSubType2Code
	 * StatusSubType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeData12 TradeData12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurStsSubTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentStatusSubType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information about the current status of the trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeData12, Optional<StatusSubType2Code>> mmCurrentStatusSubType = new MMMessageAttribute<TradeData12, Optional<StatusSubType2Code>>() {
		{
			businessComponentTrace_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData12.mmObject();
			isDerived = false;
			xmlTag = "CurStsSubTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentStatusSubType";
			definition = "Additional information about the current status of the trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> StatusSubType2Code.mmObject();
		}

		@Override
		public Optional<StatusSubType2Code> getValue(TradeData12 obj) {
			return obj.getCurrentStatusSubType();
		}

		@Override
		public void setValue(TradeData12 obj, Optional<StatusSubType2Code> value) {
			obj.setCurrentStatusSubType(value.orElse(null));
		}
	};
	@XmlElement(name = "CurStsDtTm", required = true)
	protected ISODateTime currentStatusDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusDateTime
	 * Status.mmStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeData12 TradeData12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurStsDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentStatusDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the date and time at which the current status was assigned to all the trades, unless overwritten by a date and time assigned to an individual trade."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeData12, ISODateTime> mmCurrentStatusDateTime = new MMMessageAttribute<TradeData12, ISODateTime>() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData12.mmObject();
			isDerived = false;
			xmlTag = "CurStsDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentStatusDateTime";
			definition = "Specifies the date and time at which the current status was assigned to all the trades, unless overwritten by a date and time assigned to an individual trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(TradeData12 obj) {
			return obj.getCurrentStatusDateTime();
		}

		@Override
		public void setValue(TradeData12 obj, ISODateTime value) {
			obj.setCurrentStatusDateTime(value);
		}
	};
	@XmlElement(name = "PrvsSts")
	protected Status28Choice previousStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Status28Choice
	 * Status28Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeData12 TradeData12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the previous status of a trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeData12, Optional<Status28Choice>> mmPreviousStatus = new MMMessageAttribute<TradeData12, Optional<Status28Choice>>() {
		{
			businessComponentTrace_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData12.mmObject();
			isDerived = false;
			xmlTag = "PrvsSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousStatus";
			definition = "Specifies the previous status of a trade.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Status28Choice.mmObject();
		}

		@Override
		public Optional<Status28Choice> getValue(TradeData12 obj) {
			return obj.getPreviousStatus();
		}

		@Override
		public void setValue(TradeData12 obj, Optional<Status28Choice> value) {
			obj.setPreviousStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvsStsSubTp")
	protected StatusSubType2Code previousStatusSubType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.StatusSubType2Code
	 * StatusSubType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeData12 TradeData12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsStsSubTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousStatusSubType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information on the previous status of a trade in a central system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeData12, Optional<StatusSubType2Code>> mmPreviousStatusSubType = new MMMessageAttribute<TradeData12, Optional<StatusSubType2Code>>() {
		{
			businessComponentTrace_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData12.mmObject();
			isDerived = false;
			xmlTag = "PrvsStsSubTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousStatusSubType";
			definition = "Additional information on the previous status of a trade in a central system.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> StatusSubType2Code.mmObject();
		}

		@Override
		public Optional<StatusSubType2Code> getValue(TradeData12 obj) {
			return obj.getPreviousStatusSubType();
		}

		@Override
		public void setValue(TradeData12 obj, Optional<StatusSubType2Code> value) {
			obj.setPreviousStatusSubType(value.orElse(null));
		}
	};
	@XmlElement(name = "PdctTp")
	protected Max35Text productType;
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
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmTypeOfProduct
	 * ForeignExchangeTrade.mmTypeOfProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeData12 TradeData12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the product for which the status of the confirmation is reported, unless overwritten by a product type assigned to an individual trade."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeData12, Optional<Max35Text>> mmProductType = new MMMessageAttribute<TradeData12, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> ForeignExchangeTrade.mmTypeOfProduct;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData12.mmObject();
			isDerived = false;
			xmlTag = "PdctTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductType";
			definition = "Specifies the product for which the status of the confirmation is reported, unless overwritten by a product type assigned to an individual trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TradeData12 obj) {
			return obj.getProductType();
		}

		@Override
		public void setValue(TradeData12 obj, Optional<Max35Text> value) {
			obj.setProductType(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmSsnIdr")
	protected Exact4AlphaNumericText settlementSessionIdentifier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact4AlphaNumericText
	 * Exact4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeData12 TradeData12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmSsnIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementSessionIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "To indicate the requested CLS settlement session that the related trade is part of."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeData12, Optional<Exact4AlphaNumericText>> mmSettlementSessionIdentifier = new MMMessageAttribute<TradeData12, Optional<Exact4AlphaNumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData12.mmObject();
			isDerived = false;
			xmlTag = "SttlmSsnIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSessionIdentifier";
			definition = "To indicate the requested CLS settlement session that the related trade is part of.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact4AlphaNumericText.mmObject();
		}

		@Override
		public Optional<Exact4AlphaNumericText> getValue(TradeData12 obj) {
			return obj.getSettlementSessionIdentifier();
		}

		@Override
		public void setValue(TradeData12 obj, Optional<Exact4AlphaNumericText> value) {
			obj.setSettlementSessionIdentifier(value.orElse(null));
		}
	};
	@XmlElement(name = "LkdRptId")
	protected Max35Text linkedReportIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeRelatedIdentifications
	 * Trade.mmTradeRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeData12 TradeData12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkdRptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedReportIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The identification that links the quoted trades with a submitted Report issued by a central system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeData12, Optional<Max35Text>> mmLinkedReportIdentification = new MMMessageAttribute<TradeData12, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeRelatedIdentifications;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData12.mmObject();
			isDerived = false;
			xmlTag = "LkdRptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedReportIdentification";
			definition = "The identification that links the quoted trades with a submitted Report issued by a central system.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TradeData12 obj) {
			return obj.getLinkedReportIdentification();
		}

		@Override
		public void setValue(TradeData12 obj, Optional<Max35Text> value) {
			obj.setLinkedReportIdentification(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeData12.mmMessageIdentification, com.tools20022.repository.msg.TradeData12.mmStatusOriginator,
						com.tools20022.repository.msg.TradeData12.mmCurrentStatus, com.tools20022.repository.msg.TradeData12.mmCurrentStatusSubType, com.tools20022.repository.msg.TradeData12.mmCurrentStatusDateTime,
						com.tools20022.repository.msg.TradeData12.mmPreviousStatus, com.tools20022.repository.msg.TradeData12.mmPreviousStatusSubType, com.tools20022.repository.msg.TradeData12.mmProductType,
						com.tools20022.repository.msg.TradeData12.mmSettlementSessionIdentifier, com.tools20022.repository.msg.TradeData12.mmLinkedReportIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(ForeignExchangeTradeBulkStatusNotificationV04.mmStatusDetails);
				trace_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeData12";
				definition = "Provides information on the status of a trade.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getMessageIdentification() {
		return messageIdentification;
	}

	public TradeData12 setMessageIdentification(Max35Text messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<Max35Text> getStatusOriginator() {
		return statusOriginator == null ? Optional.empty() : Optional.of(statusOriginator);
	}

	public TradeData12 setStatusOriginator(Max35Text statusOriginator) {
		this.statusOriginator = statusOriginator;
		return this;
	}

	public StatusAndSubStatus2 getCurrentStatus() {
		return currentStatus;
	}

	public TradeData12 setCurrentStatus(StatusAndSubStatus2 currentStatus) {
		this.currentStatus = Objects.requireNonNull(currentStatus);
		return this;
	}

	public Optional<StatusSubType2Code> getCurrentStatusSubType() {
		return currentStatusSubType == null ? Optional.empty() : Optional.of(currentStatusSubType);
	}

	public TradeData12 setCurrentStatusSubType(StatusSubType2Code currentStatusSubType) {
		this.currentStatusSubType = currentStatusSubType;
		return this;
	}

	public ISODateTime getCurrentStatusDateTime() {
		return currentStatusDateTime;
	}

	public TradeData12 setCurrentStatusDateTime(ISODateTime currentStatusDateTime) {
		this.currentStatusDateTime = Objects.requireNonNull(currentStatusDateTime);
		return this;
	}

	public Optional<Status28Choice> getPreviousStatus() {
		return previousStatus == null ? Optional.empty() : Optional.of(previousStatus);
	}

	public TradeData12 setPreviousStatus(Status28Choice previousStatus) {
		this.previousStatus = previousStatus;
		return this;
	}

	public Optional<StatusSubType2Code> getPreviousStatusSubType() {
		return previousStatusSubType == null ? Optional.empty() : Optional.of(previousStatusSubType);
	}

	public TradeData12 setPreviousStatusSubType(StatusSubType2Code previousStatusSubType) {
		this.previousStatusSubType = previousStatusSubType;
		return this;
	}

	public Optional<Max35Text> getProductType() {
		return productType == null ? Optional.empty() : Optional.of(productType);
	}

	public TradeData12 setProductType(Max35Text productType) {
		this.productType = productType;
		return this;
	}

	public Optional<Exact4AlphaNumericText> getSettlementSessionIdentifier() {
		return settlementSessionIdentifier == null ? Optional.empty() : Optional.of(settlementSessionIdentifier);
	}

	public TradeData12 setSettlementSessionIdentifier(Exact4AlphaNumericText settlementSessionIdentifier) {
		this.settlementSessionIdentifier = settlementSessionIdentifier;
		return this;
	}

	public Optional<Max35Text> getLinkedReportIdentification() {
		return linkedReportIdentification == null ? Optional.empty() : Optional.of(linkedReportIdentification);
	}

	public TradeData12 setLinkedReportIdentification(Max35Text linkedReportIdentification) {
		this.linkedReportIdentification = linkedReportIdentification;
		return this;
	}
}