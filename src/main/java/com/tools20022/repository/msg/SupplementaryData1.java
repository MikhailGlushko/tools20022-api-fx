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
import com.tools20022.repository.area.admi.StaticDataReportV02;
import com.tools20022.repository.area.admi.StaticDataRequestV02;
import com.tools20022.repository.area.admi.SystemEventAcknowledgementV01;
import com.tools20022.repository.area.camt.NetReportV01;
import com.tools20022.repository.area.camt.PayInCallV02;
import com.tools20022.repository.area.camt.PayInEventAcknowledgementV02;
import com.tools20022.repository.area.camt.PayInScheduleV03;
import com.tools20022.repository.area.fxtr.*;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.other.SupplementaryDataEnvelope1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Additional information that can not be captured in the structured fields
 * and/or any other specific block.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupplementaryData1#mmPlaceAndName
 * SupplementaryData1.mmPlaceAndName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SupplementaryData1#mmEnvelope
 * SupplementaryData1.mmEnvelope}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeWithdrawalNotificationV03#mmSupplementaryData
 * ForeignExchangeTradeWithdrawalNotificationV03.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.PayInCallV02#mmSupplementaryData
 * PayInCallV02.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.PayInEventAcknowledgementV02#mmSupplementaryData
 * PayInEventAcknowledgementV02.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.PayInScheduleV03#mmSupplementaryData
 * PayInScheduleV03.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.admi.StaticDataReportV02#mmSupplementaryData
 * StaticDataReportV02.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.admi.StaticDataRequestV02#mmSupplementaryData
 * StaticDataRequestV02.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.admi.SystemEventAcknowledgementV01#mmSupplementaryData
 * SystemEventAcknowledgementV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceV01#mmSupplementaryData
 * ForeignExchangeTradeConfirmationStatusAdviceV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestCancellationRequestV01#mmSupplementaryData
 * ForeignExchangeTradeConfirmationRequestCancellationRequestV01.
 * mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestAmendmentRequestV01#mmSupplementaryData
 * ForeignExchangeTradeConfirmationRequestAmendmentRequestV01.
 * mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01#mmSupplementaryData
 * ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01.
 * mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestV01#mmSupplementaryData
 * ForeignExchangeTradeConfirmationRequestV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportRequestV01#mmSupplementaryData
 * ForeignExchangeTradeCaptureReportRequestV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportV01#mmSupplementaryData
 * ForeignExchangeTradeCaptureReportV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportAcknowledgementV01#mmSupplementaryData
 * ForeignExchangeTradeCaptureReportAcknowledgementV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionV04#mmSupplementaryData
 * ForeignExchangeTradeInstructionV04.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusNotificationV06#mmSupplementaryData
 * ForeignExchangeTradeStatusNotificationV06.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04#mmSupplementaryData
 * ForeignExchangeTradeInstructionCancellationV04.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionAmendmentV04#mmSupplementaryData
 * ForeignExchangeTradeInstructionAmendmentV04.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04#mmSupplementaryData
 * ForeignExchangeTradeStatusAndDetailsNotificationV04.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeBulkStatusNotificationV04#mmSupplementaryData
 * ForeignExchangeTradeBulkStatusNotificationV04.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NetReportV01#mmSupplementaryData
 * NetReportV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forSupplementaryData1
 * ConstraintSupplementaryDataRule.forSupplementaryData1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SupplementaryData1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Additional information that can not be captured in the structured fields and/or any other specific block."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SupplementaryData1", propOrder = {"placeAndName", "envelope"})
public class SupplementaryData1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm")
	protected Max350Text placeAndName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous reference to the location where the supplementary data must be inserted in the message instance.\r\nIn the case of XML, this is expressed by a valid XPath."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SupplementaryData1, Optional<Max350Text>> mmPlaceAndName = new MMMessageAttribute<SupplementaryData1, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SupplementaryData1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Unambiguous reference to the location where the supplementary data must be inserted in the message instance.\r\nIn the case of XML, this is expressed by a valid XPath.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(SupplementaryData1 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(SupplementaryData1 obj, Optional<Max350Text> value) {
			obj.setPlaceAndName(value.orElse(null));
		}
	};
	@XmlElement(name = "Envlp", required = true)
	protected SupplementaryDataEnvelope1 envelope;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.other.SupplementaryDataEnvelope1
	 * SupplementaryDataEnvelope1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Envlp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Envelope"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Technical element wrapping the supplementary data."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SupplementaryData1, SupplementaryDataEnvelope1> mmEnvelope = new MMMessageAssociationEnd<SupplementaryData1, SupplementaryDataEnvelope1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SupplementaryData1.mmObject();
			isDerived = false;
			xmlTag = "Envlp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Envelope";
			definition = "Technical element wrapping the supplementary data.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SupplementaryDataEnvelope1.mmObject();
		}

		@Override
		public SupplementaryDataEnvelope1 getValue(SupplementaryData1 obj) {
			return obj.getEnvelope();
		}

		@Override
		public void setValue(SupplementaryData1 obj, SupplementaryDataEnvelope1 value) {
			obj.setEnvelope(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SupplementaryData1.mmPlaceAndName, com.tools20022.repository.msg.SupplementaryData1.mmEnvelope);
				messageBuildingBlock_lazy = () -> Arrays.asList(ForeignExchangeTradeWithdrawalNotificationV03.mmSupplementaryData, PayInCallV02.mmSupplementaryData, PayInEventAcknowledgementV02.mmSupplementaryData,
						PayInScheduleV03.mmSupplementaryData, StaticDataReportV02.mmSupplementaryData, StaticDataRequestV02.mmSupplementaryData, SystemEventAcknowledgementV01.mmSupplementaryData,
						ForeignExchangeTradeConfirmationStatusAdviceV01.mmSupplementaryData, ForeignExchangeTradeConfirmationRequestCancellationRequestV01.mmSupplementaryData,
						ForeignExchangeTradeConfirmationRequestAmendmentRequestV01.mmSupplementaryData, ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01.mmSupplementaryData,
						ForeignExchangeTradeConfirmationRequestV01.mmSupplementaryData, ForeignExchangeTradeCaptureReportRequestV01.mmSupplementaryData, ForeignExchangeTradeCaptureReportV01.mmSupplementaryData,
						ForeignExchangeTradeCaptureReportAcknowledgementV01.mmSupplementaryData, ForeignExchangeTradeInstructionV04.mmSupplementaryData, ForeignExchangeTradeStatusNotificationV06.mmSupplementaryData,
						ForeignExchangeTradeInstructionCancellationV04.mmSupplementaryData, ForeignExchangeTradeInstructionAmendmentV04.mmSupplementaryData, ForeignExchangeTradeStatusAndDetailsNotificationV04.mmSupplementaryData,
						ForeignExchangeTradeBulkStatusNotificationV04.mmSupplementaryData, NetReportV01.mmSupplementaryData);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forSupplementaryData1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SupplementaryData1";
				definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getPlaceAndName() {
		return placeAndName == null ? Optional.empty() : Optional.of(placeAndName);
	}

	public SupplementaryData1 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
		return this;
	}

	public SupplementaryDataEnvelope1 getEnvelope() {
		return envelope;
	}

	public SupplementaryData1 setEnvelope(SupplementaryDataEnvelope1 envelope) {
		this.envelope = Objects.requireNonNull(envelope);
		return this;
	}
}