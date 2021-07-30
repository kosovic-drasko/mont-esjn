package tenderi.domain;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;

/**
 * A Ugovor.
 */
@Entity
@Table(name = "view_ugovor")
public class UgovorPdf implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "broj_ugovora")
    private String broj_ugovora;

    @Column(name = "datum_ugovora")
    private LocalDate datum_ugovora;

    @Column(name = "predmet_ugovora")
    private String predmet_ugovora;

    @Column(name = "naziv_ponudjaca")
    private String naziv_ponudjaca;

    @Column(name = "broj_datum_tenderske_dokumntacije")
    private String broj_datum_tenderske_dokumntacije;

    @Column(name = "broj_datum_odluke")
    private String broj_datum_odluke;

    @Column(name = "broj_datum_ponude")
    private String broj_datum_ponude;

    @Column(name = "iznos_ugovora_bez_pdf")
    private Integer iznos_ugovora_bez_pdf;

    @Column(name = "sifra_postupka")
    private Integer sifra_postupka;

    @Column(name = "sifra_ponude")
    private Integer sifra_ponude;

    @Column(name = "odgovorno_lice")
    private String odgovorno_lice;

    @Column(name = "adresa_ponudjaca")
    private String adresa_ponudjaca;

    @Column(name = "banka_racun")
    private String banka_racun;

    @Column(name = "datum_objave")
    private LocalDate datum_objave;

    @Column(name = "vrsta_postupka")
    private String vrsta_postupkaa;

    public Long getId() {
        return id;
    }

    public String getBroj_ugovora() {
        return broj_ugovora;
    }

    public LocalDate getDatum_ugovora() {
        return datum_ugovora;
    }

    public String getPredmet_ugovora() {
        return predmet_ugovora;
    }

    public String getNaziv_ponudjaca() {
        return naziv_ponudjaca;
    }

    public String getBroj_datum_tenderske_dokumntacije() {
        return broj_datum_tenderske_dokumntacije;
    }

    public String getBroj_datum_odluke() {
        return broj_datum_odluke;
    }

    public String getBroj_datum_ponude() {
        return broj_datum_ponude;
    }

    public Integer getIznos_ugovora_bez_pdf() {
        return iznos_ugovora_bez_pdf;
    }

    public Integer getSifra_postupka() {
        return sifra_postupka;
    }

    public Integer getSifra_ponude() {
        return sifra_ponude;
    }

    public String getOdgovorno_lice() {
        return odgovorno_lice;
    }

    public String getAdresa_ponudjaca() {
        return adresa_ponudjaca;
    }

    public String getBanka_racun() {
        return banka_racun;
    }

    public LocalDate getDatum_objave() {
        return datum_objave;
    }

    public String getVrsta_postupkaa() {
        return vrsta_postupkaa;
    }
}
