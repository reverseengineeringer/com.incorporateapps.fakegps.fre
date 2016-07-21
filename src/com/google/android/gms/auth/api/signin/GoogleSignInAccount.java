package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.internal.zzmt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInAccount
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzb();
  public static zzmq zzWO = zzmt.zzsc();
  private static Comparator zzWV = new GoogleSignInAccount.1();
  final int versionCode;
  List zzVs;
  private String zzWP;
  private String zzWQ;
  private Uri zzWR;
  private String zzWS;
  private long zzWT;
  private String zzWU;
  private String zzWk;
  private String zzyv;
  
  GoogleSignInAccount(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, Uri paramUri, String paramString5, long paramLong, String paramString6, List paramList)
  {
    versionCode = paramInt;
    zzyv = paramString1;
    zzWk = paramString2;
    zzWP = paramString3;
    zzWQ = paramString4;
    zzWR = paramUri;
    zzWS = paramString5;
    zzWT = paramLong;
    zzWU = paramString6;
    zzVs = paramList;
  }
  
  public static GoogleSignInAccount zza(String paramString1, String paramString2, String paramString3, String paramString4, Uri paramUri, Long paramLong, String paramString5, Set paramSet)
  {
    Long localLong = paramLong;
    if (paramLong == null) {
      localLong = Long.valueOf(zzWO.currentTimeMillis() / 1000L);
    }
    return new GoogleSignInAccount(2, paramString1, paramString2, paramString3, paramString4, paramUri, null, localLong.longValue(), zzx.zzcM(paramString5), new ArrayList((Collection)zzx.zzz(paramSet)));
  }
  
  public static GoogleSignInAccount zzbH(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    JSONObject localJSONObject = new JSONObject(paramString);
    paramString = localJSONObject.optString("photoUrl", null);
    if (!TextUtils.isEmpty(paramString)) {}
    for (paramString = Uri.parse(paramString);; paramString = null)
    {
      long l = Long.parseLong(localJSONObject.getString("expirationTime"));
      HashSet localHashSet = new HashSet();
      JSONArray localJSONArray = localJSONObject.getJSONArray("grantedScopes");
      int j = localJSONArray.length();
      int i = 0;
      while (i < j)
      {
        localHashSet.add(new Scope(localJSONArray.getString(i)));
        i += 1;
      }
      return zza(localJSONObject.optString("id"), localJSONObject.optString("tokenId", null), localJSONObject.optString("email", null), localJSONObject.optString("displayName", null), paramString, Long.valueOf(l), localJSONObject.getString("obfuscatedIdentifier"), localHashSet).zzbI(localJSONObject.optString("serverAuthCode", null));
    }
  }
  
  private JSONObject zzmJ()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      if (getId() != null) {
        localJSONObject.put("id", getId());
      }
      if (getIdToken() != null) {
        localJSONObject.put("tokenId", getIdToken());
      }
      if (getEmail() != null) {
        localJSONObject.put("email", getEmail());
      }
      if (getDisplayName() != null) {
        localJSONObject.put("displayName", getDisplayName());
      }
      if (getPhotoUrl() != null) {
        localJSONObject.put("photoUrl", getPhotoUrl().toString());
      }
      if (getServerAuthCode() != null) {
        localJSONObject.put("serverAuthCode", getServerAuthCode());
      }
      localJSONObject.put("expirationTime", zzWT);
      localJSONObject.put("obfuscatedIdentifier", zzmL());
      JSONArray localJSONArray = new JSONArray();
      Collections.sort(zzVs, zzWV);
      Iterator localIterator = zzVs.iterator();
      while (localIterator.hasNext()) {
        localJSONArray.put(((Scope)localIterator.next()).zzpb());
      }
      localJSONException.put("grantedScopes", localJSONArray);
    }
    catch (JSONException localJSONException)
    {
      throw new RuntimeException(localJSONException);
    }
    return localJSONException;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof GoogleSignInAccount)) {
      return false;
    }
    return ((GoogleSignInAccount)paramObject).zzmI().equals(zzmI());
  }
  
  public String getDisplayName()
  {
    return zzWQ;
  }
  
  public String getEmail()
  {
    return zzWP;
  }
  
  public Set getGrantedScopes()
  {
    return new HashSet(zzVs);
  }
  
  public String getId()
  {
    return zzyv;
  }
  
  public String getIdToken()
  {
    return zzWk;
  }
  
  public Uri getPhotoUrl()
  {
    return zzWR;
  }
  
  public String getServerAuthCode()
  {
    return zzWS;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
  
  public boolean zzb()
  {
    return zzWO.currentTimeMillis() / 1000L >= zzWT - 300L;
  }
  
  public GoogleSignInAccount zzbI(String paramString)
  {
    zzWS = paramString;
    return this;
  }
  
  public String zzmI()
  {
    return zzmJ().toString();
  }
  
  public long zzmK()
  {
    return zzWT;
  }
  
  public String zzmL()
  {
    return zzWU;
  }
  
  public String zzmM()
  {
    JSONObject localJSONObject = zzmJ();
    localJSONObject.remove("serverAuthCode");
    return localJSONObject.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.signin.GoogleSignInAccount
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */