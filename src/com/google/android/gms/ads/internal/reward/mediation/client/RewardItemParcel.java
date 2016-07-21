package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class RewardItemParcel
  implements SafeParcelable
{
  public static final zzc CREATOR = new zzc();
  public final String type;
  public final int versionCode;
  public final int zzKS;
  
  public RewardItemParcel(int paramInt1, String paramString, int paramInt2)
  {
    versionCode = paramInt1;
    type = paramString;
    zzKS = paramInt2;
  }
  
  public RewardItemParcel(RewardItem paramRewardItem)
  {
    this(1, paramRewardItem.getType(), paramRewardItem.getAmount());
  }
  
  public RewardItemParcel(String paramString, int paramInt)
  {
    this(1, paramString, paramInt);
  }
  
  public static RewardItemParcel zza(JSONArray paramJSONArray)
  {
    if ((paramJSONArray == null) || (paramJSONArray.length() == 0)) {
      return null;
    }
    return new RewardItemParcel(paramJSONArray.getJSONObject(0).optString("rb_type"), paramJSONArray.getJSONObject(0).optInt("rb_amount"));
  }
  
  public static RewardItemParcel zzay(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    try
    {
      paramString = zza(new JSONArray(paramString));
      return paramString;
    }
    catch (JSONException paramString) {}
    return null;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof RewardItemParcel))) {}
    do
    {
      return false;
      paramObject = (RewardItemParcel)paramObject;
    } while ((!zzw.equal(type, type)) || (!zzw.equal(Integer.valueOf(zzKS), Integer.valueOf(zzKS))));
    return true;
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(new Object[] { type, Integer.valueOf(zzKS) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
  
  public final JSONArray zzgR()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("rb_type", type);
    localJSONObject.put("rb_amount", zzKS);
    JSONArray localJSONArray = new JSONArray();
    localJSONArray.put(localJSONObject);
    return localJSONArray;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */