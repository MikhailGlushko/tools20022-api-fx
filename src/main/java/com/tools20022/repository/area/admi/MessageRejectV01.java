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
import com.tools20022.repository.msg.MessageReference;
import com.tools20022.repository.msg.RejectionReason2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The MessageReject message is sent by a central system to notify the rejection
 * of a previously received message.<br>
 * <b>Usage</b><br>
 * The message provides specific information about the rejection reason.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.admi.MessageRejectV01#mmRelatedReference
 * MessageRejectV01.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.admi.MessageRejectV01#mmReason
 * MessageRejectV01.mmReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "admi.002.001.01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AdministrationLatestVersion
 * AdministrationLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code admi.002.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MessageRejectV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe MessageReject message is sent by a central system to notify the rejection of a previously received message.\r\nUsage\r\nThe message provides specific information about the rejection reason."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MessageRejectV01", propOrder = {"relatedReference", "reason"})
public class MessageRejectV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RltdRef", required = true)
	protected MessageReference relatedReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageReference
	 * MessageReference}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Refers to the identification of the message previously received and for which the rejection is notified."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MessageRejectV01, MessageReference> mmRelatedReference = new MMMessageBuildingBlock<MessageRejectV01, MessageReference>() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Refers to the identification of the message previously received and for which the rejection is notified.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageReference.mmObject();
		}

		@Override
		public MessageReference getValue(MessageRejectV01 obj) {
			return obj.getRelatedReference();
		}

		@Override
		public void setValue(MessageRejectV01 obj, MessageReference value) {
			obj.setRelatedReference(value);
		}
	};
	@XmlElement(name = "Rsn", required = true)
	protected RejectionReason2 reason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.RejectionReason2
	 * RejectionReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "General information about the reason of the message rejection."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MessageRejectV01, RejectionReason2> mmReason = new MMMessageBuildingBlock<MessageRejectV01, RejectionReason2>() {
		{
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "General information about the reason of the message rejection.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> RejectionReason2.mmObject();
		}

		@Override
		public RejectionReason2 getValue(MessageRejectV01 obj) {
			return obj.getReason();
		}

		@Override
		public void setValue(MessageRejectV01 obj, RejectionReason2 value) {
			obj.setReason(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MessageRejectV01";
				definition = "Scope\r\nThe MessageReject message is sent by a central system to notify the rejection of a previously received message.\r\nUsage\r\nThe message provides specific information about the rejection reason.";
				rootElement = "Document";
				xmlTag = "admi.002.001.01";
				businessArea_lazy = () -> AdministrationLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.admi.MessageRejectV01.mmRelatedReference, com.tools20022.repository.area.admi.MessageRejectV01.mmReason);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "admi";
						messageFunctionality = "002";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MessageRejectV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageReference getRelatedReference() {
		return relatedReference;
	}

	public MessageRejectV01 setRelatedReference(MessageReference relatedReference) {
		this.relatedReference = Objects.requireNonNull(relatedReference);
		return this;
	}

	public RejectionReason2 getReason() {
		return reason;
	}

	public MessageRejectV01 setReason(RejectionReason2 reason) {
		this.reason = Objects.requireNonNull(reason);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:admi.002.001.01")
	static public class Document {
		@XmlElement(name = "admi.002.001.01", required = true)
		public MessageRejectV01 messageBody;
	}
}