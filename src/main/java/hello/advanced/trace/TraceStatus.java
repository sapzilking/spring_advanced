package hello.advanced.trace;

import lombok.Getter;

/**
 * 로그 시작시의 상태 정보를 가지고 있다
 * */
@Getter
public class TraceStatus {

    private TraceId traceId;
    private Long startTimeMs; // 로그 시작시간
    private String message;

    public TraceStatus(TraceId traceId, Long startTimeMs, String message) {
        this.traceId = traceId;
        this.startTimeMs = startTimeMs;
        this.message = message;
    }
}
