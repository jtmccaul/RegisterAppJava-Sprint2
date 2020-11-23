/*
	<Sprint4>
    Created by Toma Tomonari
*/
package edu.uark.registerapp.models.api;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;

import edu.uark.registerapp.models.entities.TransactionEntity;
import edu.uark.registerapp.models.entities.TransactionEntryEntity;

public class Transaction extends ApiResponse {
	private UUID id;
	public UUID getId() {
		return this.id;
	}
	public Transaction setId(final UUID id) {
		this.id = id;
		return this;
    }

    private UUID productId;
    public UUID getProductId() {
        return this.productId;
    }
    public Transaction setProductId(final UUID productId) {
        this.productId = productId;
        return this;
    }

    // private String lookupCode;
	// public String getLookupCode() {
	// 	return this.lookupCode;
	// }
	// public Product setLookupCode(final String lookupCode) {
	// 	this.lookupCode = lookupCode;
	// 	return this;
	// }


    private double quantitiy;
    public double getQuantity() {
        return this.quantitiy;
    }
    public Transaction setQuantity(final double quantity) {
        return this.quantitiy = quantity;
    }

	private long price;
	public long getPrice() {
		return this.price;
	}
	public Transaction setPrice(final long price) {
		this.price = price;
		return this;
    }

    private double totalQuantity;
    public double getTotalQuantity() {
        return this.totalQuantity;
    }
    public Transaction setTotalQuantity(final double totalQuantity) {
        this.totalQuantity = totalQuantity;
        return this;
    }
    
    private long subTotalPrice;
    public long getSubTotalPrice() {
        return this.subTotalPrice;
    }
    public Transaction setSubTotalPrice(final long subTotalPrice) {
        this.subTotalPrice = subTotalPrice;
        return this;
    }

    private long totalPrice;
    public getTotalPrice() {
        return this.totalPrice;
    }
    public setTotalPrice(final long totalPrice) {
        this. totalPrice = totalPrice;
        return this;
    }

	private int count;

	public int getCount() {
		return this.count;
	}

	public Product setCount(final int count) {
		this.count = count;
		return this;
	}

	private String createdOn;

	public String getCreatedOn() {
		return this.createdOn;
	}

	public Product setCreatedOn(final String createdOn) {
		this.createdOn = createdOn;
		return this;
	}

	public Product setCreatedOn(final LocalDateTime createdOn) {
		this.createdOn =
			createdOn.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));

		return this;
	}

	public Transaction() {
		super();

		this.count = -1;
		this.id = new UUID(0, 0);
		this.price = 0L;
		this.lookupCode = StringUtils.EMPTY;

		this.setCreatedOn(LocalDateTime.now());
	}

	public Transaction(final TransactionEntity transactionEntity) {
		super(false);

		this.id = transactionEntity.getId();
		this.price = transactionEntity.getPrice();
		this.count = transactionEntity.getCount();
		this.lookupCode = transactionEntity.getLookupCode();

		this.setCreatedOn(transactionEntity.getCreatedOn());
	}
}
