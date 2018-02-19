package android.support.v4.f;

import android.support.v4.g.class_130;
import android.util.Base64;
import java.util.List;

// $FF: renamed from: android.support.v4.f.a
public final class class_113 {
    // $FF: renamed from: a java.lang.String
    private final String field_976;
    // $FF: renamed from: b java.lang.String
    private final String field_977;
    // $FF: renamed from: c java.lang.String
    private final String field_978;
    // $FF: renamed from: d java.util.List
    private final List field_979;
    // $FF: renamed from: e int
    private final int field_980;
    // $FF: renamed from: f java.lang.String
    private final String field_981;

    public class_113(String var1, String var2, String var3, List var4) {
        this.field_976 = (String)class_130.method_1075(var1);
        this.field_977 = (String)class_130.method_1075(var2);
        this.field_978 = (String)class_130.method_1075(var3);
        this.field_979 = (List)class_130.method_1075(var4);
        this.field_980 = 0;
        this.field_981 = this.field_976 + "-" + this.field_977 + "-" + this.field_978;
    }

    // $FF: renamed from: a () java.lang.String
    public String method_989() {
        return this.field_976;
    }

    // $FF: renamed from: b () java.lang.String
    public String method_990() {
        return this.field_977;
    }

    // $FF: renamed from: c () java.lang.String
    public String method_991() {
        return this.field_978;
    }

    // $FF: renamed from: d () java.util.List
    public List method_992() {
        return this.field_979;
    }

    // $FF: renamed from: e () int
    public int method_993() {
        return this.field_980;
    }

    // $FF: renamed from: f () java.lang.String
    public String method_994() {
        return this.field_981;
    }

    public String toString() {
        StringBuilder var3 = new StringBuilder();
        var3.append("FontRequest {mProviderAuthority: " + this.field_976 + ", mProviderPackage: " + this.field_977 + ", mQuery: " + this.field_978 + ", mCertificates:");

        for(int var1 = 0; var1 < this.field_979.size(); ++var1) {
            var3.append(" [");
            List var4 = (List)this.field_979.get(var1);

            for(int var2 = 0; var2 < var4.size(); ++var2) {
                var3.append(" \"");
                var3.append(Base64.encodeToString((byte[])var4.get(var2), 0));
                var3.append("\"");
            }

            var3.append(" ]");
        }

        var3.append("}");
        var3.append("mCertificatesArray: " + this.field_980);
        return var3.toString();
    }
}
