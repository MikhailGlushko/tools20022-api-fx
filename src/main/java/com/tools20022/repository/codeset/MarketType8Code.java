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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.MarketType8Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of place where a trade was executed, a price was sourced
 * from, an instrument is listed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.MarketType8Code#Counter
 * MarketType8Code.Counter}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MarketType8Code#InterBank
 * MarketType8Code.InterBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarketType8Code#OverTheCounter
 * MarketType8Code.OverTheCounter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarketType8Code#PrimaryMarket
 * MarketType8Code.PrimaryMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarketType8Code#SecondaryMarket
 * MarketType8Code.SecondaryMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarketType8Code#StockExchange
 * MarketType8Code.StockExchange}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MarketType8Code#Various
 * MarketType8Code.Various}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.MarketTypeCode MarketTypeCode}</li>
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
 * "MarketType8Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of place where a trade was executed, a price was sourced from, an instrument is listed."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MarketType8Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarketType8Code
	 * MarketType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Counter"</li>
	 * </ul>
	 */
	public static final MarketType8Code Counter = new MarketType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Counter";
			owner_lazy = () -> com.tools20022.repository.codeset.MarketType8Code.mmObject();
			codeName = MarketTypeCode.Counter.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarketType8Code
	 * MarketType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterBank"</li>
	 * </ul>
	 */
	public static final MarketType8Code InterBank = new MarketType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterBank";
			owner_lazy = () -> com.tools20022.repository.codeset.MarketType8Code.mmObject();
			codeName = MarketTypeCode.InterBank.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarketType8Code
	 * MarketType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverTheCounter"</li>
	 * </ul>
	 */
	public static final MarketType8Code OverTheCounter = new MarketType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OverTheCounter";
			owner_lazy = () -> com.tools20022.repository.codeset.MarketType8Code.mmObject();
			codeName = MarketTypeCode.OverTheCounter.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarketType8Code
	 * MarketType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrimaryMarket"</li>
	 * </ul>
	 */
	public static final MarketType8Code PrimaryMarket = new MarketType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryMarket";
			owner_lazy = () -> com.tools20022.repository.codeset.MarketType8Code.mmObject();
			codeName = MarketTypeCode.PrimaryMarket.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarketType8Code
	 * MarketType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondaryMarket"</li>
	 * </ul>
	 */
	public static final MarketType8Code SecondaryMarket = new MarketType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryMarket";
			owner_lazy = () -> com.tools20022.repository.codeset.MarketType8Code.mmObject();
			codeName = MarketTypeCode.SecondaryMarket.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarketType8Code
	 * MarketType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockExchange"</li>
	 * </ul>
	 */
	public static final MarketType8Code StockExchange = new MarketType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockExchange";
			owner_lazy = () -> com.tools20022.repository.codeset.MarketType8Code.mmObject();
			codeName = MarketTypeCode.StockExchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarketType8Code
	 * MarketType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Various"</li>
	 * </ul>
	 */
	public static final MarketType8Code Various = new MarketType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Various";
			owner_lazy = () -> com.tools20022.repository.codeset.MarketType8Code.mmObject();
			codeName = MarketTypeCode.Various.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, MarketType8Code> codesByName = new LinkedHashMap<>();

	protected MarketType8Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarketType8Code";
				definition = "Specifies the type of place where a trade was executed, a price was sourced from, an instrument is listed.";
				trace_lazy = () -> MarketTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MarketType8Code.Counter, com.tools20022.repository.codeset.MarketType8Code.InterBank, com.tools20022.repository.codeset.MarketType8Code.OverTheCounter,
						com.tools20022.repository.codeset.MarketType8Code.PrimaryMarket, com.tools20022.repository.codeset.MarketType8Code.SecondaryMarket, com.tools20022.repository.codeset.MarketType8Code.StockExchange,
						com.tools20022.repository.codeset.MarketType8Code.Various);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Counter.getCodeName().get(), Counter);
		codesByName.put(InterBank.getCodeName().get(), InterBank);
		codesByName.put(OverTheCounter.getCodeName().get(), OverTheCounter);
		codesByName.put(PrimaryMarket.getCodeName().get(), PrimaryMarket);
		codesByName.put(SecondaryMarket.getCodeName().get(), SecondaryMarket);
		codesByName.put(StockExchange.getCodeName().get(), StockExchange);
		codesByName.put(Various.getCodeName().get(), Various);
	}

	public static MarketType8Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MarketType8Code[] values() {
		MarketType8Code[] values = new MarketType8Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MarketType8Code> {
		@Override
		public MarketType8Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MarketType8Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}