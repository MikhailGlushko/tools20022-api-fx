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
import com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportAcknowledgementV01;
import com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportV01;
import com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceV01;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyIdentification;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Business reference(s) to one or more relevant messages previously sent by
 * other parties, or by the same party issuing this message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalReferences#mmReference
 * AdditionalReferences.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalReferences#mmMessageName
 * AdditionalReferences.mmMessageName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalReferences#mmReferenceIssuer
 * AdditionalReferences.mmReferenceIssuer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.GenericIdentification
 * GenericIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceV01#mmReference
 * ForeignExchangeTradeConfirmationStatusAdviceV01.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportV01#mmReference
 * ForeignExchangeTradeCaptureReportV01.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportAcknowledgementV01#mmReference
 * ForeignExchangeTradeCaptureReportAcknowledgementV01.mmReference}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerAndOrMessageNameRule#forAdditionalReferences
 * ConstraintIssuerAndOrMessageNameRule.forAdditionalReferences}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AdditionalReferences"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Business reference(s) to one or more relevant messages previously sent by other parties, or by the same party issuing this message."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AdditionalReferences", propOrder = {"reference", "messageName", "referenceIssuer"})
public class AdditionalReferences {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Ref", required = true)
	protected Max35Text reference;
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
	 * {@linkplain com.tools20022.repository.msg.AdditionalReferences
	 * AdditionalReferences}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ref"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous reference to a previous message having a business relevance with this message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdditionalReferences, Max35Text> mmReference = new MMMessageAttribute<AdditionalReferences, Max35Text>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalReferences.mmObject();
			isDerived = false;
			xmlTag = "Ref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "Unambiguous reference to a previous message having a business relevance with this message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(AdditionalReferences obj) {
			return obj.getReference();
		}

		@Override
		public void setValue(AdditionalReferences obj, Max35Text value) {
			obj.setReference(value);
		}
	};
	@XmlElement(name = "MsgNm")
	protected Max35Text messageName;
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
	 * {@linkplain com.tools20022.repository.msg.AdditionalReferences
	 * AdditionalReferences}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the message which contained the given additional reference as its message reference."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdditionalReferences, Optional<Max35Text>> mmMessageName = new MMMessageAttribute<AdditionalReferences, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalReferences.mmObject();
			isDerived = false;
			xmlTag = "MsgNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageName";
			definition = "Name of the message which contained the given additional reference as its message reference.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(AdditionalReferences obj) {
			return obj.getMessageName();
		}

		@Override
		public void setValue(AdditionalReferences obj, Optional<Max35Text> value) {
			obj.setMessageName(value.orElse(null));
		}
	};
	@XmlElement(name = "RefIssr")
	protected PartyIdentification referenceIssuer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification
	 * PartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReferences
	 * AdditionalReferences}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefIssr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceIssuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that initially assigned the given additional reference."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdditionalReferences, Optional<PartyIdentification>> mmReferenceIssuer = new MMMessageAttribute<AdditionalReferences, Optional<PartyIdentification>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalReferences.mmObject();
			isDerived = false;
			xmlTag = "RefIssr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceIssuer";
			definition = "Party that initially assigned the given additional reference.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification.mmObject();
		}

		@Override
		public Optional<PartyIdentification> getValue(AdditionalReferences obj) {
			return obj.getReferenceIssuer();
		}

		@Override
		public void setValue(AdditionalReferences obj, Optional<PartyIdentification> value) {
			obj.setReferenceIssuer(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditionalReferences.mmReference, com.tools20022.repository.msg.AdditionalReferences.mmMessageName,
						com.tools20022.repository.msg.AdditionalReferences.mmReferenceIssuer);
				messageBuildingBlock_lazy = () -> Arrays.asList(ForeignExchangeTradeConfirmationStatusAdviceV01.mmReference, ForeignExchangeTradeCaptureReportV01.mmReference, ForeignExchangeTradeCaptureReportAcknowledgementV01.mmReference);
				trace_lazy = () -> GenericIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIssuerAndOrMessageNameRule.forAdditionalReferences);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdditionalReferences";
				definition = "Business reference(s) to one or more relevant messages previously sent by other parties, or by the same party issuing this message.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getReference() {
		return reference;
	}

	public AdditionalReferences setReference(Max35Text reference) {
		this.reference = Objects.requireNonNull(reference);
		return this;
	}

	public Optional<Max35Text> getMessageName() {
		return messageName == null ? Optional.empty() : Optional.of(messageName);
	}

	public AdditionalReferences setMessageName(Max35Text messageName) {
		this.messageName = messageName;
		return this;
	}

	public Optional<PartyIdentification> getReferenceIssuer() {
		return referenceIssuer == null ? Optional.empty() : Optional.of(referenceIssuer);
	}

	public AdditionalReferences setReferenceIssuer(PartyIdentification referenceIssuer) {
		this.referenceIssuer = referenceIssuer;
		return this;
	}
}