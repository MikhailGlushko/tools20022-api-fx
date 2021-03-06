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

package com.tools20022.repository.area.admi;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AdministrationLatestVersion;
import com.tools20022.repository.datatype.Exact4AlphaNumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.Event1;
import com.tools20022.repository.msg.SupplementaryData1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * The SystemEventAcknowledgement message is sent by a participant of a central
 * system to the central system to acknowledge the notification of an occurrence
 * of an event in a central system.<br>
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.admi.SystemEventAcknowledgementV01#mmMessageIdentification
 * SystemEventAcknowledgementV01.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.admi.SystemEventAcknowledgementV01#mmOriginatorReference
 * SystemEventAcknowledgementV01.mmOriginatorReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.admi.SystemEventAcknowledgementV01#mmSettlementSessionIdentifier
 * SystemEventAcknowledgementV01.mmSettlementSessionIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.admi.SystemEventAcknowledgementV01#mmAcknowledgementDetails
 * SystemEventAcknowledgementV01.mmAcknowledgementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.admi.SystemEventAcknowledgementV01#mmSupplementaryData
 * SystemEventAcknowledgementV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SysEvtAck"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AdministrationLatestVersion
 * AdministrationLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code admi.011.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SystemEventAcknowledgementV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The SystemEventAcknowledgement message is sent by a participant of a central system to the central system to acknowledge the notification of an occurrence of an event in a central system.\r\n"
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SystemEventAcknowledgementV01", propOrder = {"messageIdentification", "originatorReference", "settlementSessionIdentifier", "acknowledgementDetails", "supplementaryData"})
public class SystemEventAcknowledgementV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgId", required = true)
	protected Max35Text messageIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
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
	 * "Unique and unambiguous identifier for the message, as assigned by the sender."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SystemEventAcknowledgementV01, Max35Text> mmMessageIdentification = new MMMessageBuildingBlock<SystemEventAcknowledgementV01, Max35Text>() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Unique and unambiguous identifier for the message, as assigned by the sender.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(SystemEventAcknowledgementV01 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(SystemEventAcknowledgementV01 obj, Max35Text value) {
			obj.setMessageIdentification(value);
		}
	};
	@XmlElement(name = "OrgtrRef")
	protected Max35Text originatorReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgtrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginatorReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Represents the original reference of the system event notification for which the acknowledgement is given, as assigned by the central system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SystemEventAcknowledgementV01, Optional<Max35Text>> mmOriginatorReference = new MMMessageBuildingBlock<SystemEventAcknowledgementV01, Optional<Max35Text>>() {
		{
			xmlTag = "OrgtrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginatorReference";
			definition = "Represents the original reference of the system event notification for which the acknowledgement is given, as assigned by the central system.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SystemEventAcknowledgementV01 obj) {
			return obj.getOriginatorReference();
		}

		@Override
		public void setValue(SystemEventAcknowledgementV01 obj, Optional<Max35Text> value) {
			obj.setOriginatorReference(value.orElse(null));
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
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact4AlphaNumericText
	 * Exact4AlphaNumericText}</li>
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
	 * "To indicate the requested CLS Settlement Session that the related trade is part of."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SystemEventAcknowledgementV01, Optional<Exact4AlphaNumericText>> mmSettlementSessionIdentifier = new MMMessageBuildingBlock<SystemEventAcknowledgementV01, Optional<Exact4AlphaNumericText>>() {
		{
			xmlTag = "SttlmSsnIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSessionIdentifier";
			definition = "To indicate the requested CLS Settlement Session that the related trade is part of.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact4AlphaNumericText.mmObject();
		}

		@Override
		public Optional<Exact4AlphaNumericText> getValue(SystemEventAcknowledgementV01 obj) {
			return obj.getSettlementSessionIdentifier();
		}

		@Override
		public void setValue(SystemEventAcknowledgementV01 obj, Optional<Exact4AlphaNumericText> value) {
			obj.setSettlementSessionIdentifier(value.orElse(null));
		}
	};
	@XmlElement(name = "AckDtls")
	protected Event1 acknowledgementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Event1 Event1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AckDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the system event being acknowledged."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SystemEventAcknowledgementV01, Optional<Event1>> mmAcknowledgementDetails = new MMMessageBuildingBlock<SystemEventAcknowledgementV01, Optional<Event1>>() {
		{
			xmlTag = "AckDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgementDetails";
			definition = "Details of the system event being acknowledged.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Event1.mmObject();
		}

		@Override
		public Optional<Event1> getValue(SystemEventAcknowledgementV01 obj) {
			return obj.getAcknowledgementDetails();
		}

		@Override
		public void setValue(SystemEventAcknowledgementV01 obj, Optional<Event1> value) {
			obj.setAcknowledgementDetails(value.orElse(null));
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
	public static final MMMessageBuildingBlock<SystemEventAcknowledgementV01, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<SystemEventAcknowledgementV01, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(SystemEventAcknowledgementV01 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(SystemEventAcknowledgementV01 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SystemEventAcknowledgementV01";
				definition = "The SystemEventAcknowledgement message is sent by a participant of a central system to the central system to acknowledge the notification of an occurrence of an event in a central system.\r\n";
				rootElement = "Document";
				xmlTag = "SysEvtAck";
				businessArea_lazy = () -> AdministrationLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.admi.SystemEventAcknowledgementV01.mmMessageIdentification,
						com.tools20022.repository.area.admi.SystemEventAcknowledgementV01.mmOriginatorReference, com.tools20022.repository.area.admi.SystemEventAcknowledgementV01.mmSettlementSessionIdentifier,
						com.tools20022.repository.area.admi.SystemEventAcknowledgementV01.mmAcknowledgementDetails, com.tools20022.repository.area.admi.SystemEventAcknowledgementV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "admi";
						messageFunctionality = "011";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SystemEventAcknowledgementV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getMessageIdentification() {
		return messageIdentification;
	}

	public SystemEventAcknowledgementV01 setMessageIdentification(Max35Text messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<Max35Text> getOriginatorReference() {
		return originatorReference == null ? Optional.empty() : Optional.of(originatorReference);
	}

	public SystemEventAcknowledgementV01 setOriginatorReference(Max35Text originatorReference) {
		this.originatorReference = originatorReference;
		return this;
	}

	public Optional<Exact4AlphaNumericText> getSettlementSessionIdentifier() {
		return settlementSessionIdentifier == null ? Optional.empty() : Optional.of(settlementSessionIdentifier);
	}

	public SystemEventAcknowledgementV01 setSettlementSessionIdentifier(Exact4AlphaNumericText settlementSessionIdentifier) {
		this.settlementSessionIdentifier = settlementSessionIdentifier;
		return this;
	}

	public Optional<Event1> getAcknowledgementDetails() {
		return acknowledgementDetails == null ? Optional.empty() : Optional.of(acknowledgementDetails);
	}

	public SystemEventAcknowledgementV01 setAcknowledgementDetails(Event1 acknowledgementDetails) {
		this.acknowledgementDetails = acknowledgementDetails;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public SystemEventAcknowledgementV01 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:admi.011.001.01")
	static public class Document {
		@XmlElement(name = "SysEvtAck", required = true)
		public SystemEventAcknowledgementV01 messageBody;
	}
}