package be.dumbo.switchfully.parkshark.domain.member.address;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

    @Column(name="STREET_NAME")
    private String streetName;
    @Column(name="STREET_NUMBER")
    private String streetNumber;
    @Column(name="POSTAL_CODE")
    private String postalCode;
    @Column(name="LABEL")
    private String label;

    private Address() {
    }

    private Address(String streetName, String streetNumber, String postalCode, String label) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.postalCode = postalCode;
        this.label = label;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getLabel() {
        return label;
    }

    public static class AddressBuilder {

        private String streetName;
        private String streetNumber;
        private String postalCode;
        private String label;

        private AddressBuilder() {}

        public static AddressBuilder address() {
            return new AddressBuilder();
        }

        public AddressBuilder withStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public AddressBuilder withStreetNumber(String streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }

        public AddressBuilder withPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public AddressBuilder withLabel(String label) {
            this.label = label;
            return this;
        }

          public Address build() {
            return new Address(streetName,streetNumber,postalCode,label);
        }
    }
}
