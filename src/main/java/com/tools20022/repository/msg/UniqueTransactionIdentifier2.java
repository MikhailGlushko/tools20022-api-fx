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
import com.tools20022.repository.datatype.Max52Text;
import com.tools20022.repository.entity.TradeIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the unique transaction identifier (UTI) that was created at the
 * time a transaction was first executed, shared with all registered entities
 * and counterparties involved in the transaction, and used to track that
 * particular transaction during its lifetime and optionally, the prior unique
 * transaction identifier (PUTI). These identifiers can also be known as the
 * Unique Swap Identifier (USI) or the Prior Unique Swap Identifier (PUSI).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UniqueTransactionIdentifier2#mmUniqueTransactionIdentifier
 * UniqueTransactionIdentifier2.mmUniqueTransactionIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UniqueTransactionIdentifier2#mmPriorUniqueTransactionIdentifier
 * UniqueTransactionIdentifier2.mmPriorUniqueTransactionIdentifier}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TradeIdentification
 * TradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UniqueTransactionIdentifier2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the unique transaction identifier (UTI) that was created at the time a transaction was first executed, shared with all registered entities and counterparties involved in the transaction, and used to track that particular transaction during its lifetime and optionally, the prior unique transaction identifier (PUTI). These identifiers can also be known as the Unique Swap Identifier (USI) or the Prior Unique Swap Identifier (PUSI). "
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "UniqueTransactionIdentifier2", propOrder = {"uniqueTransactionIdentifier", "priorUniqueTransactionIdentifier"})
public class UniqueTransactionIdentifier2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max52Text uniqueTransactionIdentifier;
	/**
	 * Unique transaction identifier will be created at the time a transaction
	 * is first executed, shared with all registered entities and counterparties
	 * involved in the transaction, and used to track that particular
	 * transaction during its lifetime. This identifier can also be known as the
	 * Unique Swap Identifier (USI).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max52Text
	 * Max52Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmUniqueTradeIdentifier
	 * TradeIdentification.mmUniqueTradeIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UniqueTransactionIdentifier2
	 * UniqueTransactionIdentifier2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnqTxIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UniqueTransactionIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique transaction identifier will be created at the time a transaction is first executed, shared with all registered entities and counterparties involved in the transaction, and used to track that particular transaction during its lifetime. This identifier can also be known as the Unique Swap Identifier (USI)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUniqueTransactionIdentifier = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmUniqueTradeIdentifier;
			componentContext_lazy = () -> UniqueTransactionIdentifier2.mmObject();
			isDerived = false;
			xmlTag = "UnqTxIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UniqueTransactionIdentifier";
			definition = "Unique transaction identifier will be created at the time a transaction is first executed, shared with all registered entities and counterparties involved in the transaction, and used to track that particular transaction during its lifetime. This identifier can also be known as the Unique Swap Identifier (USI).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max52Text.mmObject();
		}
	};
	protected List<Max52Text> priorUniqueTransactionIdentifier;
	/**
	 * Prior unique transaction identifier specifies the previous unique
	 * transaction identifier (UTI) that was created at the time the transaction
	 * was executed. This identifier can also be known as the Prior Unique Swap
	 * Identifier (PUSI).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max52Text
	 * Max52Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmUniqueTradeIdentifier
	 * TradeIdentification.mmUniqueTradeIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UniqueTransactionIdentifier2
	 * UniqueTransactionIdentifier2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrrUnqTxIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriorUniqueTransactionIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Prior unique transaction identifier specifies the previous unique transaction identifier (UTI) that was created at the time the transaction was executed. This identifier can also be known as the Prior Unique Swap Identifier (PUSI)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPriorUniqueTransactionIdentifier = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmUniqueTradeIdentifier;
			componentContext_lazy = () -> UniqueTransactionIdentifier2.mmObject();
			isDerived = false;
			xmlTag = "PrrUnqTxIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriorUniqueTransactionIdentifier";
			definition = "Prior unique transaction identifier specifies the previous unique transaction identifier (UTI) that was created at the time the transaction was executed. This identifier can also be known as the Prior Unique Swap Identifier (PUSI).";
			minOccurs = 0;
			simpleType_lazy = () -> Max52Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(UniqueTransactionIdentifier2.mmUniqueTransactionIdentifier, UniqueTransactionIdentifier2.mmPriorUniqueTransactionIdentifier);
				trace_lazy = () -> TradeIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UniqueTransactionIdentifier2";
				definition = "Specifies the unique transaction identifier (UTI) that was created at the time a transaction was first executed, shared with all registered entities and counterparties involved in the transaction, and used to track that particular transaction during its lifetime and optionally, the prior unique transaction identifier (PUTI). These identifiers can also be known as the Unique Swap Identifier (USI) or the Prior Unique Swap Identifier (PUSI). ";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "UnqTxIdr", required = true)
	public Max52Text getUniqueTransactionIdentifier() {
		return uniqueTransactionIdentifier;
	}

	public void setUniqueTransactionIdentifier(Max52Text uniqueTransactionIdentifier) {
		this.uniqueTransactionIdentifier = uniqueTransactionIdentifier;
	}

	@XmlElement(name = "PrrUnqTxIdr")
	public List<Max52Text> getPriorUniqueTransactionIdentifier() {
		return priorUniqueTransactionIdentifier;
	}

	public void setPriorUniqueTransactionIdentifier(List<Max52Text> priorUniqueTransactionIdentifier) {
		this.priorUniqueTransactionIdentifier = priorUniqueTransactionIdentifier;
	}
}