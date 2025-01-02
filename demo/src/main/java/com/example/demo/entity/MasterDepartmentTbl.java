package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

/**
 * Class MasterDepartmentTbl.
 *
 * @author bimalkumar.s,jyothi.e
 */
@Entity
@Table(name = "master_department_tbl")
//@JsonInclude(value = Include.NON_NULL)
public class MasterDepartmentTbl {

	/** Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** department id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//1
	@Column(name = "dept_id", updatable = false, nullable = false)
	private Long departmentId;
//2
	@Column(name = "dept_image")
	@Lob
	private String deptImage;
//3
	@Column(name = "department_code")
	private String departmentCode;
//4
	@Column(name = "department_desc")
	private String departmentDesc;
//5
	@Column(name = "hod")
	private long hod;
//6
	@Column(name = "is_bed_avaliable")
	private int isBedAvaliable;
//7
	@Column(name = "flag")
	private String flag;
//8
//	@Column(name = "material_group_sp_id")
//	private MaterialGroupSpTbl materialGroupSpTbl;
//	

	// @Column(name = "generated_by")
	// private String generatedBy;

	@Column(name = "updated_by")
	private String updatedBy;
//9
	@Column(name = "sap_flag")
	private Character sapFlag;
//10
	@Column(name = "dept_status")
	private Character deptStatus;
//11
	@Column(name = "update_flag")
	private Character updateFlag;

	/*
	 * @Column(name = "is_clinical_flag") private Integer isClinicalFlag;
	 * 
	 * @Column(name = "dept_short_desc") private String deptShortDesc;
	 * 
	 * @Column(name = "mobile_number") private String mobileNumber;
	 */

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDeptImage() {
		return deptImage;
	}

	public void setDeptImage(String deptImage) {
		this.deptImage = deptImage;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public String getDepartmentDesc() {
		return departmentDesc;
	}

	public void setDepartmentDesc(String departmentDesc) {
		this.departmentDesc = departmentDesc;
	}

	public long getHod() {
		return hod;
	}

	public void setHod(long hod) {
		this.hod = hod;
	}

	public int getIsBedAvaliable() {
		return isBedAvaliable;
	}

	public void setIsBedAvaliable(int isBedAvaliable) {
		this.isBedAvaliable = isBedAvaliable;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	/*
	 * public String getGeneratedBy() { return generatedBy; }
	 * 
	 * public void setGeneratedBy(String generatedBy) { this.generatedBy =
	 * generatedBy; }
	 */

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Character getSapFlag() {
		return sapFlag;
	}

	public void setSapFlag(Character sapFlag) {
		this.sapFlag = sapFlag;
	}

	public Character getDeptStatus() {
		return deptStatus;
	}

	public void setDeptStatus(Character deptStatus) {
		this.deptStatus = deptStatus;
	}

	public Character getUpdateFlag() {
		return updateFlag;
	}

	public void setUpdateFlag(Character updateFlag) {
		this.updateFlag = updateFlag;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/*
	 * public void setDeptImage(MultipartFile file) { this.file=file;
	 * 
	 * }
	 */

	/**
	 * Gets department code.
	 *
	 * @return department code
	 */

}
