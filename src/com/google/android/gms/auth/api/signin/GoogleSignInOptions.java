package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.zze;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInOptions
  implements Api.ApiOptions.Optional, SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzc();
  public static final GoogleSignInOptions DEFAULT_SIGN_IN;
  private static Comparator zzWV = new GoogleSignInOptions.1();
  public static final Scope zzWW = new Scope("profile");
  public static final Scope zzWX = new Scope("email");
  public static final Scope zzWY = new Scope("openid");
  final int versionCode;
  private Account zzTI;
  private final ArrayList zzWZ;
  private boolean zzXa;
  private final boolean zzXb;
  private final boolean zzXc;
  private String zzXd;
  private String zzXe;
  
  static
  {
    DEFAULT_SIGN_IN = new GoogleSignInOptions.Builder().requestId().requestProfile().build();
  }
  
  GoogleSignInOptions(int paramInt, ArrayList paramArrayList, Account paramAccount, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString1, String paramString2)
  {
    versionCode = paramInt;
    zzWZ = paramArrayList;
    zzTI = paramAccount;
    zzXa = paramBoolean1;
    zzXb = paramBoolean2;
    zzXc = paramBoolean3;
    zzXd = paramString1;
    zzXe = paramString2;
  }
  
  private GoogleSignInOptions(Set paramSet, Account paramAccount, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString1, String paramString2)
  {
    this(2, new ArrayList(paramSet), paramAccount, paramBoolean1, paramBoolean2, paramBoolean3, paramString1, paramString2);
  }
  
  public static GoogleSignInOptions zzbJ(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    JSONObject localJSONObject = new JSONObject(paramString);
    HashSet localHashSet = new HashSet();
    paramString = localJSONObject.getJSONArray("scopes");
    int j = paramString.length();
    int i = 0;
    while (i < j)
    {
      localHashSet.add(new Scope(paramString.getString(i)));
      i += 1;
    }
    paramString = localJSONObject.optString("accountName", null);
    if (!TextUtils.isEmpty(paramString)) {}
    for (paramString = new Account(paramString, "com.google");; paramString = null) {
      return new GoogleSignInOptions(localHashSet, paramString, localJSONObject.getBoolean("idTokenRequested"), localJSONObject.getBoolean("serverAuthRequested"), localJSONObject.getBoolean("forceCodeForRefreshToken"), localJSONObject.optString("serverClientId", null), localJSONObject.optString("hostedDomain", null));
    }
  }
  
  private JSONObject zzmJ()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      JSONArray localJSONArray = new JSONArray();
      Collections.sort(zzWZ, zzWV);
      Iterator localIterator = zzWZ.iterator();
      while (localIterator.hasNext()) {
        localJSONArray.put(((Scope)localIterator.next()).zzpb());
      }
      localJSONException.put("scopes", localJSONArray);
    }
    catch (JSONException localJSONException)
    {
      throw new RuntimeException(localJSONException);
    }
    if (zzTI != null) {
      localJSONException.put("accountName", zzTI.name);
    }
    localJSONException.put("idTokenRequested", zzXa);
    localJSONException.put("forceCodeForRefreshToken", zzXc);
    localJSONException.put("serverAuthRequested", zzXb);
    if (!TextUtils.isEmpty(zzXd)) {
      localJSONException.put("serverClientId", zzXd);
    }
    if (!TextUtils.isEmpty(zzXe)) {
      localJSONException.put("hostedDomain", zzXe);
    }
    return localJSONException;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    for (;;)
    {
      return false;
      try
      {
        paramObject = (GoogleSignInOptions)paramObject;
        if ((zzWZ.size() != ((GoogleSignInOptions)paramObject).zzmN().size()) || (!zzWZ.containsAll(((GoogleSignInOptions)paramObject).zzmN()))) {
          continue;
        }
        if (zzTI == null)
        {
          if (((GoogleSignInOptions)paramObject).getAccount() != null) {
            continue;
          }
          label56:
          if (!TextUtils.isEmpty(zzXd)) {
            break label128;
          }
          if (!TextUtils.isEmpty(((GoogleSignInOptions)paramObject).zzmR())) {
            continue;
          }
        }
        while ((zzXc == ((GoogleSignInOptions)paramObject).zzmQ()) && (zzXa == ((GoogleSignInOptions)paramObject).zzmO()) && (zzXb == ((GoogleSignInOptions)paramObject).zzmP()))
        {
          return true;
          if (!zzTI.equals(((GoogleSignInOptions)paramObject).getAccount())) {
            break;
          }
          break label56;
          label128:
          boolean bool = zzXd.equals(((GoogleSignInOptions)paramObject).zzmR());
          if (!bool) {
            break;
          }
        }
        return false;
      }
      catch (ClassCastException paramObject) {}
    }
  }
  
  public Account getAccount()
  {
    return zzTI;
  }
  
  public Scope[] getScopeArray()
  {
    return (Scope[])zzWZ.toArray(new Scope[zzWZ.size()]);
  }
  
  public int hashCode()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = zzWZ.iterator();
    while (localIterator.hasNext()) {
      localArrayList.add(((Scope)localIterator.next()).zzpb());
    }
    Collections.sort(localArrayList);
    return new zze().zzp(localArrayList).zzp(zzTI).zzp(zzXd).zzP(zzXc).zzP(zzXa).zzP(zzXb).zzne();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
  
  public String zzmI()
  {
    return zzmJ().toString();
  }
  
  public ArrayList zzmN()
  {
    return new ArrayList(zzWZ);
  }
  
  public boolean zzmO()
  {
    return zzXa;
  }
  
  public boolean zzmP()
  {
    return zzXb;
  }
  
  public boolean zzmQ()
  {
    return zzXc;
  }
  
  public String zzmR()
  {
    return zzXd;
  }
  
  public String zzmS()
  {
    return zzXe;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.signin.GoogleSignInOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */