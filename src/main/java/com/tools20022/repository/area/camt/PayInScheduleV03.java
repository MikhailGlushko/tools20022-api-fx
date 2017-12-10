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

package com.tools20022.repository.area.camt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.CashManagementLatestVersion;
import com.tools20022.repository.choice.PartyIdentification73Choice;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * The PayInSchedule message is sent by a central settlement system to the
 * participant to provide notification of a series of timed payments scheduled
 * for each currency at the time and date of the schedule generation. The
 * central settlement system may send information about how the timed payments
 * have been calculated.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.PayInScheduleV03#mmPartyIdentification
 * PayInScheduleV03.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.PayInScheduleV03#mmReportData
 * PayInScheduleV03.mmReportData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.PayInScheduleV03#mmPayInScheduleLongBalance
 * PayInScheduleV03.mmPayInScheduleLongBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.PayInScheduleV03#mmPayInScheduleItem
 * PayInScheduleV03.mmPayInScheduleItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.PayInScheduleV03#mmPayInFactors
 * PayInScheduleV03.mmPayInFactors}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.PayInScheduleV03#mmSupplementaryData
 * PayInScheduleV03.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "PayInSchdl"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.062.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PayInScheduleV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The PayInSchedule message is sent by a central settlement system to the participant to provide notification of a series of timed payments scheduled for each currency at the time and date of the schedule generation. The central settlement system may send information about how the timed payments have been calculated."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PayInScheduleV03", propOrder = {"partyIdentification", "reportData", "payInScheduleLongBalance", "payInScheduleItem", "payInFactors", "supplementaryData"})
public class PayInScheduleV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected PartyIdentification73Choice partyIdentification;
	/**
	 * Party for which the pay-in schedule is generated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification73Choice
	 * PartyIdentification73Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party for which the pay-in schedule is generated."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPartyIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "PtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyIdentification";
			definition = "Party for which the pay-in schedule is generated.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification73Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PayInScheduleV03.class.getMethod("getPartyIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ReportData4 reportData;
	/**
	 * General information applicable to the report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ReportData4
	 * ReportData4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "General information applicable to the report."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReportData = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportData";
			definition = "General information applicable to the report.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ReportData4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PayInScheduleV03.class.getMethod("getReportData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<BalanceStatus2> payInScheduleLongBalance;
	/**
	 * Projected net position for all currencies, projected long for the value
	 * date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.BalanceStatus2
	 * BalanceStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PayInSchdlLngBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayInScheduleLongBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Projected net position for all currencies, projected long for the value date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPayInScheduleLongBalance = new MMMessageBuildingBlock() {
		{
			xmlTag = "PayInSchdlLngBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayInScheduleLongBalance";
			definition = "Projected net position for all currencies, projected long for the value date.";
			minOccurs = 0;
			complexType_lazy = () -> BalanceStatus2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PayInScheduleV03.class.getMethod("getPayInScheduleLongBalance", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<PayInScheduleItems1> payInScheduleItem;
	/**
	 * Currency and total amount to be paid in by the corresponding deadline.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PayInScheduleItems1
	 * PayInScheduleItems1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PayInSchdlItm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayInScheduleItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency and total amount to be paid in by the corresponding deadline."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPayInScheduleItem = new MMMessageBuildingBlock() {
		{
			xmlTag = "PayInSchdlItm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayInScheduleItem";
			definition = "Currency and total amount to be paid in by the corresponding deadline.";
			minOccurs = 0;
			complexType_lazy = () -> PayInScheduleItems1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PayInScheduleV03.class.getMethod("getPayInScheduleItem", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PayInFactors1 payInFactors;
	/**
	 * Factors used in the calculation of the pay-in schedule.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PayInFactors1
	 * PayInFactors1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PayInFctrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayInFactors"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Factors used in the calculation of the pay-in schedule."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPayInFactors = new MMMessageBuildingBlock() {
		{
			xmlTag = "PayInFctrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayInFactors";
			definition = "Factors used in the calculation of the pay-in schedule.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PayInFactors1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PayInScheduleV03.class.getMethod("getPayInFactors", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
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
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PayInScheduleV03.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PayInScheduleV03";
				definition = "The PayInSchedule message is sent by a central settlement system to the participant to provide notification of a series of timed payments scheduled for each currency at the time and date of the schedule generation. The central settlement system may send information about how the timed payments have been calculated.";
				rootElement = "Document";
				xmlTag = "PayInSchdl";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.PayInScheduleV03.mmPartyIdentification, com.tools20022.repository.area.camt.PayInScheduleV03.mmReportData,
						com.tools20022.repository.area.camt.PayInScheduleV03.mmPayInScheduleLongBalance, com.tools20022.repository.area.camt.PayInScheduleV03.mmPayInScheduleItem,
						com.tools20022.repository.area.camt.PayInScheduleV03.mmPayInFactors, com.tools20022.repository.area.camt.PayInScheduleV03.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "062";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return PayInScheduleV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PtyId", required = true)
	public PartyIdentification73Choice getPartyIdentification() {
		return partyIdentification;
	}

	public void setPartyIdentification(PartyIdentification73Choice partyIdentification) {
		this.partyIdentification = partyIdentification;
	}

	@XmlElement(name = "RptData", required = true)
	public ReportData4 getReportData() {
		return reportData;
	}

	public void setReportData(ReportData4 reportData) {
		this.reportData = reportData;
	}

	@XmlElement(name = "PayInSchdlLngBal")
	public List<BalanceStatus2> getPayInScheduleLongBalance() {
		return payInScheduleLongBalance;
	}

	public void setPayInScheduleLongBalance(List<BalanceStatus2> payInScheduleLongBalance) {
		this.payInScheduleLongBalance = payInScheduleLongBalance;
	}

	@XmlElement(name = "PayInSchdlItm")
	public List<PayInScheduleItems1> getPayInScheduleItem() {
		return payInScheduleItem;
	}

	public void setPayInScheduleItem(List<PayInScheduleItems1> payInScheduleItem) {
		this.payInScheduleItem = payInScheduleItem;
	}

	@XmlElement(name = "PayInFctrs")
	public PayInFactors1 getPayInFactors() {
		return payInFactors;
	}

	public void setPayInFactors(PayInFactors1 payInFactors) {
		this.payInFactors = payInFactors;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:camt.062.03.03")
	static public class Document {
		@XmlElement(name = "PayInSchdl", required = true)
		public PayInScheduleV03 messageBody;
	}
}