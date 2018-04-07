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

package com.tools20022.repository.area.fxtr;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.ForeignExchangeTradeLatestVersion;
import com.tools20022.repository.msg.Pagination;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msg.TradeData11;
import com.tools20022.repository.msg.TradeData12;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * Scope <br>
 * The ForeignExchangeTradeBulkStatusNotification message is sent by a central
 * system to the participant to provide notification of the current status of
 * one or more foreign exchange trades.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeBulkStatusNotificationV04#mmStatusDetails
 * ForeignExchangeTradeBulkStatusNotificationV04.mmStatusDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeBulkStatusNotificationV04#mmTradeData
 * ForeignExchangeTradeBulkStatusNotificationV04.mmTradeData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeBulkStatusNotificationV04#mmMessagePagination
 * ForeignExchangeTradeBulkStatusNotificationV04.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeBulkStatusNotificationV04#mmSupplementaryData
 * ForeignExchangeTradeBulkStatusNotificationV04.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FXTradBlkStsNtfctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.ForeignExchangeTradeLatestVersion
 * ForeignExchangeTradeLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code fxtr.030.001.04}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementSessionIdentifierRule#for_fxtr_ForeignExchangeTradeBulkStatusNotificationV04
 * ConstraintSettlementSessionIdentifierRule.
 * for_fxtr_ForeignExchangeTradeBulkStatusNotificationV04}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ForeignExchangeTradeBulkStatusNotificationV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\r\nThe ForeignExchangeTradeBulkStatusNotification message is sent by a central system to the participant to provide notification of the current status of one or more foreign exchange trades."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ForeignExchangeTradeBulkStatusNotificationV04", propOrder = {"statusDetails", "tradeData", "messagePagination", "supplementaryData"})
public class ForeignExchangeTradeBulkStatusNotificationV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "StsDtls", required = true)
	protected TradeData12 statusDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.TradeData12
	 * TradeData12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on the status of the trade in the central system.\r\n"</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeBulkStatusNotificationV04, TradeData12> mmStatusDetails = new MMMessageBuildingBlock<ForeignExchangeTradeBulkStatusNotificationV04, TradeData12>() {
		{
			xmlTag = "StsDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusDetails";
			definition = "Information on the status of the trade in the central system.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradeData12.mmObject();
		}

		@Override
		public TradeData12 getValue(ForeignExchangeTradeBulkStatusNotificationV04 obj) {
			return obj.getStatusDetails();
		}

		@Override
		public void setValue(ForeignExchangeTradeBulkStatusNotificationV04 obj, TradeData12 value) {
			obj.setStatusDetails(value);
		}
	};
	@XmlElement(name = "TradData", required = true)
	protected List<TradeData11> tradeData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.TradeData11
	 * TradeData11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies one or more trades for which the status notification is sent.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeBulkStatusNotificationV04, List<TradeData11>> mmTradeData = new MMMessageBuildingBlock<ForeignExchangeTradeBulkStatusNotificationV04, List<TradeData11>>() {
		{
			xmlTag = "TradData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeData";
			definition = "Identifies one or more trades for which the status notification is sent.\r\n";
			minOccurs = 1;
			complexType_lazy = () -> TradeData11.mmObject();
		}

		@Override
		public List<TradeData11> getValue(ForeignExchangeTradeBulkStatusNotificationV04 obj) {
			return obj.getTradeData();
		}

		@Override
		public void setValue(ForeignExchangeTradeBulkStatusNotificationV04 obj, List<TradeData11> value) {
			obj.setTradeData(value);
		}
	};
	@XmlElement(name = "MsgPgntn")
	protected Pagination messagePagination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Pagination
	 * Pagination}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgPgntn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessagePagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Page number of the message (within the status report) and continuation indicator to indicate that the statement is to continue or that the message is the last page of the report."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeBulkStatusNotificationV04, Optional<Pagination>> mmMessagePagination = new MMMessageBuildingBlock<ForeignExchangeTradeBulkStatusNotificationV04, Optional<Pagination>>() {
		{
			xmlTag = "MsgPgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessagePagination";
			definition = "Page number of the message (within the status report) and continuation indicator to indicate that the statement is to continue or that the message is the last page of the report.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Pagination.mmObject();
		}

		@Override
		public Optional<Pagination> getValue(ForeignExchangeTradeBulkStatusNotificationV04 obj) {
			return obj.getMessagePagination();
		}

		@Override
		public void setValue(ForeignExchangeTradeBulkStatusNotificationV04 obj, Optional<Pagination> value) {
			obj.setMessagePagination(value.orElse(null));
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeBulkStatusNotificationV04, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<ForeignExchangeTradeBulkStatusNotificationV04, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(ForeignExchangeTradeBulkStatusNotificationV04 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(ForeignExchangeTradeBulkStatusNotificationV04 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementSessionIdentifierRule.for_fxtr_ForeignExchangeTradeBulkStatusNotificationV04);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ForeignExchangeTradeBulkStatusNotificationV04";
				definition = "Scope\r\r\nThe ForeignExchangeTradeBulkStatusNotification message is sent by a central system to the participant to provide notification of the current status of one or more foreign exchange trades.";
				rootElement = "Document";
				xmlTag = "FXTradBlkStsNtfctn";
				businessArea_lazy = () -> ForeignExchangeTradeLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.fxtr.ForeignExchangeTradeBulkStatusNotificationV04.mmStatusDetails,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeBulkStatusNotificationV04.mmTradeData, com.tools20022.repository.area.fxtr.ForeignExchangeTradeBulkStatusNotificationV04.mmMessagePagination,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeBulkStatusNotificationV04.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "fxtr";
						messageFunctionality = "030";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ForeignExchangeTradeBulkStatusNotificationV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TradeData12 getStatusDetails() {
		return statusDetails;
	}

	public ForeignExchangeTradeBulkStatusNotificationV04 setStatusDetails(TradeData12 statusDetails) {
		this.statusDetails = Objects.requireNonNull(statusDetails);
		return this;
	}

	public List<TradeData11> getTradeData() {
		return tradeData == null ? tradeData = new ArrayList<>() : tradeData;
	}

	public ForeignExchangeTradeBulkStatusNotificationV04 setTradeData(List<TradeData11> tradeData) {
		this.tradeData = Objects.requireNonNull(tradeData);
		return this;
	}

	public Optional<Pagination> getMessagePagination() {
		return messagePagination == null ? Optional.empty() : Optional.of(messagePagination);
	}

	public ForeignExchangeTradeBulkStatusNotificationV04 setMessagePagination(Pagination messagePagination) {
		this.messagePagination = messagePagination;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public ForeignExchangeTradeBulkStatusNotificationV04 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:fxtr.030.001.04")
	static public class Document {
		@XmlElement(name = "FXTradBlkStsNtfctn", required = true)
		public ForeignExchangeTradeBulkStatusNotificationV04 messageBody;
	}
}