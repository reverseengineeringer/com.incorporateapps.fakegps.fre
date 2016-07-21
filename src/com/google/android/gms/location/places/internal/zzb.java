package com.google.android.gms.location.places.internal;

import android.text.style.CharacterStyle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.AutocompletePrediction;
import java.util.Collections;
import java.util.List;

public class zzb
  extends zzt
  implements AutocompletePrediction
{
  public zzb(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }
  
  private String zzzh()
  {
    return zzG("ap_description", "");
  }
  
  private String zzzi()
  {
    return zzG("ap_primary_text", "");
  }
  
  private String zzzj()
  {
    return zzG("ap_secondary_text", "");
  }
  
  private List zzzk()
  {
    return zza("ap_matched_subscriptions", AutocompletePredictionEntity.SubstringEntity.CREATOR, Collections.emptyList());
  }
  
  private List zzzl()
  {
    return zza("ap_primary_text_matched", AutocompletePredictionEntity.SubstringEntity.CREATOR, Collections.emptyList());
  }
  
  private List zzzm()
  {
    return zza("ap_secondary_text_matched", AutocompletePredictionEntity.SubstringEntity.CREATOR, Collections.emptyList());
  }
  
  public String getDescription()
  {
    return zzzh();
  }
  
  public CharSequence getFullText(CharacterStyle paramCharacterStyle)
  {
    return zzc.zza(zzzh(), zzzk(), paramCharacterStyle);
  }
  
  public List getMatchedSubstrings()
  {
    return zzzk();
  }
  
  public String getPlaceId()
  {
    return zzG("ap_place_id", null);
  }
  
  public List getPlaceTypes()
  {
    return zza("ap_place_types", Collections.emptyList());
  }
  
  public CharSequence getPrimaryText(CharacterStyle paramCharacterStyle)
  {
    return zzc.zza(zzzi(), zzzl(), paramCharacterStyle);
  }
  
  public CharSequence getSecondaryText(CharacterStyle paramCharacterStyle)
  {
    return zzc.zza(zzzj(), zzzm(), paramCharacterStyle);
  }
  
  public AutocompletePrediction zzzf()
  {
    return AutocompletePredictionEntity.zza(getPlaceId(), getPlaceTypes(), zzzg(), zzzh(), zzzk(), zzzi(), zzzl(), zzzj(), zzzm());
  }
  
  public int zzzg()
  {
    return zzz("ap_personalization_type", 6);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.internal.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */