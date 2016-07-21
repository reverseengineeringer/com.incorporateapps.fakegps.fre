package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzr;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class zzbt
{
  public static final zzbp zzvA = zzbp.zza(0, "gads:sdk_core_experiment_id");
  public static final zzbp zzvB = zzbp.zza(0, "gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html");
  public static final zzbp zzvC = zzbp.zza(0, "gads:request_builder:singleton_webview", Boolean.valueOf(false));
  public static final zzbp zzvD = zzbp.zza(0, "gads:request_builder:singleton_webview_experiment_id");
  public static final zzbp zzvE = zzbp.zza(0, "gads:sdk_use_dynamic_module", Boolean.valueOf(false));
  public static final zzbp zzvF = zzbp.zza(0, "gads:sdk_use_dynamic_module_experiment_id");
  public static final zzbp zzvG = zzbp.zza(0, "gads:sdk_crash_report_enabled", Boolean.valueOf(false));
  public static final zzbp zzvH = zzbp.zza(0, "gads:sdk_crash_report_full_stacktrace", Boolean.valueOf(false));
  public static final zzbp zzvI = zzbp.zza(0, "gads:block_autoclicks", Boolean.valueOf(false));
  public static final zzbp zzvJ = zzbp.zza(0, "gads:block_autoclicks_experiment_id");
  public static final zzbp zzvK = zzbp.zzb(0, "gads:prefetch:experiment_id");
  public static final zzbp zzvL = zzbp.zza(0, "gads:spam_app_context:experiment_id");
  public static final zzbp zzvM = zzbp.zza(0, "gads:spam_app_context:enabled", Boolean.valueOf(false));
  public static final zzbp zzvN = zzbp.zza(0, "gads:video_stream_cache:experiment_id");
  public static final zzbp zzvO = zzbp.zza(0, "gads:video_stream_cache:limit_count", 5);
  public static final zzbp zzvP = zzbp.zza(0, "gads:video_stream_cache:limit_space", 8388608);
  public static final zzbp zzvQ = zzbp.zza(0, "gads:video_stream_exo_cache:buffer_size", 8388608);
  public static final zzbp zzvR = zzbp.zza(0, "gads:video_stream_cache:limit_time_sec", 300L);
  public static final zzbp zzvS = zzbp.zza(0, "gads:video_stream_cache:notify_interval_millis", 1000L);
  public static final zzbp zzvT = zzbp.zza(0, "gads:video_stream_cache:connect_timeout_millis", 10000);
  public static final zzbp zzvU = zzbp.zza(0, "gads:video:metric_reporting_enabled", Boolean.valueOf(false));
  public static final zzbp zzvV = zzbp.zza(0, "gads:video:metric_frame_hash_times", "");
  public static final zzbp zzvW = zzbp.zza(0, "gads:video:metric_frame_hash_time_leniency", 500L);
  public static final zzbp zzvX = zzbp.zzb(0, "gads:spam_ad_id_decorator:experiment_id");
  public static final zzbp zzvY = zzbp.zza(0, "gads:spam_ad_id_decorator:enabled", Boolean.valueOf(false));
  public static final zzbp zzvZ = zzbp.zzb(0, "gads:looper_for_gms_client:experiment_id");
  public static final zzbp zzwA = zzbp.zza(0, "gads:webview_cache_version", 0);
  public static final zzbp zzwB = zzbp.zzb(0, "gads:pan:experiment_id");
  public static final zzbp zzwC = zzbp.zza(0, "gads:native:engine_url", "//googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");
  public static final zzbp zzwD = zzbp.zza(0, "gads:ad_manager_creator:enabled", Boolean.valueOf(true));
  public static final zzbp zzwE = zzbp.zza(1, "gads:interstitial_ad_pool:enabled", Boolean.valueOf(false));
  public static final zzbp zzwF = zzbp.zza(1, "gads:interstitial_ad_pool:schema", "customTargeting");
  public static final zzbp zzwG = zzbp.zza(1, "gads:interstitial_ad_pool:max_pools", 3);
  public static final zzbp zzwH = zzbp.zza(1, "gads:interstitial_ad_pool:max_pool_depth", 2);
  public static final zzbp zzwI = zzbp.zza(1, "gads:interstitial_ad_pool:time_limit_sec", 1200);
  public static final zzbp zzwJ = zzbp.zza(1, "gads:interstitial_ad_pool:experiment_id");
  public static final zzbp zzwK = zzbp.zza(0, "gads:log:verbose_enabled", Boolean.valueOf(false));
  public static final zzbp zzwL = zzbp.zza(0, "gads:device_info_caching:enabled", Boolean.valueOf(true));
  public static final zzbp zzwM = zzbp.zza(0, "gads:device_info_caching_expiry_ms:expiry", 300000L);
  public static final zzbp zzwN = zzbp.zza(0, "gads:gen204_signals:enabled", Boolean.valueOf(false));
  public static final zzbp zzwO = zzbp.zza(0, "gads:webview:error_reporting_enabled", Boolean.valueOf(false));
  public static final zzbp zzwP = zzbp.zza(0, "gads:adid_reporting:enabled", Boolean.valueOf(false));
  public static final zzbp zzwQ = zzbp.zza(0, "gads:ad_settings_page_reporting:enabled", Boolean.valueOf(false));
  public static final zzbp zzwR = zzbp.zza(0, "gads:adid_info_gmscore_upgrade_reporting:enabled", Boolean.valueOf(false));
  public static final zzbp zzwS = zzbp.zza(0, "gads:request_pkg:enabled", Boolean.valueOf(true));
  public static final zzbp zzwT = zzbp.zza(0, "gads:gmsg:disable_back_button:enabled", Boolean.valueOf(false));
  public static final zzbp zzwU = zzbp.zza(0, "gads:network:cache_prediction_duration_s", 300L);
  public static final zzbp zzwV = zzbp.zza(0, "gads:mediation:dynamite_first:admobadapter", Boolean.valueOf(true));
  public static final zzbp zzwW = zzbp.zza(0, "gads:mediation:dynamite_first:adurladapter", Boolean.valueOf(true));
  public static final zzbp zzwX = zzbp.zza(0, "gads:ad_loader:timeout_ms", 60000L);
  public static final zzbp zzwY = zzbp.zza(0, "gads:rendering:timeout_ms", 60000L);
  public static final zzbp zzwZ = zzbp.zza(0, "gads:adshield:enable_adshield_instrumentation", Boolean.valueOf(false));
  public static final zzbp zzwa = zzbp.zza(0, "gads:looper_for_gms_client:enabled", Boolean.valueOf(true));
  public static final zzbp zzwb = zzbp.zza(0, "gads:sw_ad_request_service:enabled", Boolean.valueOf(true));
  public static final zzbp zzwc = zzbp.zza(0, "gads:sw_dynamite:enabled", Boolean.valueOf(true));
  public static final zzbp zzwd = zzbp.zza(0, "gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js");
  public static final zzbp zzwe = zzbp.zza(0, "gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js");
  public static final zzbp zzwf = zzbp.zza(0, "gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js");
  public static final zzbp zzwg = zzbp.zza(0, "gads:enabled_sdk_csi", Boolean.valueOf(false));
  public static final zzbp zzwh = zzbp.zza(0, "gads:sdk_csi_server", "https://csi.gstatic.com/csi");
  public static final zzbp zzwi = zzbp.zza(0, "gads:sdk_csi_write_to_file", Boolean.valueOf(false));
  public static final zzbp zzwj = zzbp.zza(0, "gads:enable_content_fetching", Boolean.valueOf(true));
  public static final zzbp zzwk = zzbp.zza(0, "gads:content_length_weight", 1);
  public static final zzbp zzwl = zzbp.zza(0, "gads:content_age_weight", 1);
  public static final zzbp zzwm = zzbp.zza(0, "gads:min_content_len", 11);
  public static final zzbp zzwn = zzbp.zza(0, "gads:fingerprint_number", 10);
  public static final zzbp zzwo = zzbp.zza(0, "gads:sleep_sec", 10);
  public static final zzbp zzwp = zzbp.zza(0, "gad:app_index_enabled", Boolean.valueOf(true));
  public static final zzbp zzwq = zzbp.zza(0, "gads:app_index:without_content_info_present:enabled", Boolean.valueOf(true));
  public static final zzbp zzwr = zzbp.zza(0, "gads:app_index:timeout_ms", 1000L);
  public static final zzbp zzws = zzbp.zza(0, "gads:app_index:experiment_id");
  public static final zzbp zzwt = zzbp.zza(0, "gads:kitkat_interstitial_workaround:experiment_id");
  public static final zzbp zzwu = zzbp.zza(0, "gads:kitkat_interstitial_workaround:enabled", Boolean.valueOf(true));
  public static final zzbp zzwv = zzbp.zza(0, "gads:interstitial_follow_url", Boolean.valueOf(true));
  public static final zzbp zzww = zzbp.zza(0, "gads:interstitial_follow_url:register_click", Boolean.valueOf(true));
  public static final zzbp zzwx = zzbp.zza(0, "gads:interstitial_follow_url:experiment_id");
  public static final zzbp zzwy = zzbp.zza(0, "gads:analytics_enabled", Boolean.valueOf(true));
  public static final zzbp zzwz = zzbp.zza(0, "gads:ad_key_enabled", Boolean.valueOf(false));
  public static final zzbp zzxa = zzbp.zza(0, "gass:enabled", Boolean.valueOf(false));
  public static final zzbp zzxb = zzbp.zza(0, "gass:enable_int_signal", Boolean.valueOf(true));
  public static final zzbp zzxc = zzbp.zza(0, "gads:adid_notification:first_party_check:enabled", Boolean.valueOf(true));
  public static final zzbp zzxd = zzbp.zza(0, "gads:edu_device_helper:enabled", Boolean.valueOf(true));
  public static final zzbp zzxe = zzbp.zza(0, "gads:support_screen_shot", Boolean.valueOf(true));
  public static final zzbp zzxf = zzbp.zza(0, "gads:js_flags:update_interval", TimeUnit.HOURS.toMillis(12L));
  public static final zzbp zzxg = zzbp.zza(0, "gads:custom_render:ping_on_ad_rendered", Boolean.valueOf(false));
  
  public static void initialize(Context paramContext)
  {
    zzjb.zzb(new zzbt.1(paramContext));
  }
  
  public static List zzdr()
  {
    return zzr.zzbK().zzdr();
  }
  
  public static List zzds()
  {
    return zzr.zzbK().zzds();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzbt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */