package eu.bittrade.libs.steem.api.wrapper.models;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * This class is the java implementation of the Steem "signed_block" object.
 * 
 * @author <a href="http://steemit.com/@dez1337">dez1337</a>
 */
public class SignedBlock extends SignedBlockHeader {
    // TODO: Original type is vector<signed_transaction> - Do we implement the
    // signed_transaction object?.
    protected List<Transaction> transactions;

    /**
     * @return the transactions
     */
    public List<Transaction> getTransactions() {
        return transactions;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}