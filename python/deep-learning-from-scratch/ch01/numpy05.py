# 브로드캐스트
# 형상이 다른 배열의 연산
import numpy as np

A = np.array([[1, 2], [3, 4]])
B = np.array([10, 20])
print(A * B)    # 연산시 B가 자동으로 2 * 2 행렬로 브로드캐스팅